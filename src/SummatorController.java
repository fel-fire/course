package ru.mfti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


//REST API
@RestController
class SummatorController {
    
    @GetMapping("/make")
    public String arithmeticExpression(String expression) {

        if (!isValid(expression)) return "Incorrect input value";
        String exp = expression.replaceAll(" ", "");
        return makeOpreation(exp);

    }

    private static String makeOpreation(String exp) {

        String result = "";
        while (exp.contains("(")) {
            int indexOfLeftBracket = exp.lastIndexOf('(');
            int indexOfRightBracket = exp.indexOf(')', indexOfLeftBracket);
            if (indexOfRightBracket == -1) return "Incorrect input value";
            String subexpression = exp.substring(indexOfLeftBracket + 1, indexOfRightBracket);
            String subresult = makeOpreation(subexpression);
            String regex = "\\(" + subexpression + "\\)";
            regex = regex.replaceAll("\\+", "\\\\+");
            regex = regex.replaceAll("\\*", "\\\\*");
            exp = exp.replaceAll(regex, subresult);
        }

        exp = exp.replaceAll("(\\+\\+)|(--)", "+");
        exp = exp.replaceAll("(\\+-)|(-\\+)", "-");
        String[] array = exp.split("(?<=[0-9])(?=[+-])");

        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i].contains("*") || array[i].contains("/")) {
                    array[i] = multipleAndDivide(array[i]);
                }
            }
            result = addAndSubstract(array);
        } catch (ArithmeticException e) {
            return "Incorrect operation: division by 0";

        } catch (Exception e) {
            return "Incorrect input value";
        }
        return result;
    }

    private static String multipleAndDivide(String s) throws Exception {

        double newResult;
        String[] subarray = s.split("(?=[*/])");
        newResult = Double.parseDouble(subarray[0]);
        for (int j = 0; j < subarray.length; j++) {
            if (subarray[j].startsWith("/")) {
                double divisor = Double.parseDouble(subarray[j].substring(1));
                if (divisor == 0.0) {
                    throw new ArithmeticException();
                }
                newResult /= divisor;
            }
            if (subarray[j].startsWith("*")) newResult *= Double.parseDouble(subarray[j].substring(1));
        }
        return String.valueOf(newResult);
    }

    private static String addAndSubstract(String[] array) throws Exception {
        double result = 0;
        for (String line : array) {
            result += Double.parseDouble(line);
            result = Math.round(result*10000.0)/10000.0;
        }
        return String.valueOf(result);
    }

    private static boolean isValid(String expression) {
        if (expression == null || expression.isEmpty()) return false;
        if (!expression.matches("[0-9()+\\-*/ .]+")) return false;

        char[] chars = expression.toCharArray();
        if (expression.startsWith("*") || expression.startsWith("/")) return false;
        if  (!(Character.isDigit(chars[chars.length-1]) || chars[chars.length-1] == ')')) return false;

        int leftBrackets = 0;
        int rightBrackets = 0;
        for (char c : chars) {
            switch (c) {
                case '(' : leftBrackets++;
                    break;
                case ')' : rightBrackets++;
            }
        }
        if (leftBrackets != rightBrackets) return false;

        return true;
    }
}
