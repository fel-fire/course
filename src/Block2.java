public class Block2 {

    //2.1
    public static double fraction(double x) {
        return x - (int)x;
    }

    //2.2
    public static int sumLastNums(int x) {
        if (x > -10 && x < 10) {
            return 0;
        }
        x = Math.abs(x%100);
        return x/10 + x%10;
    }

    //2.3
    public static int charToNum(char x) {
        return Character.getNumericValue(x);
    }

    //2.4
    public static boolean isPositive(int x) {
        return x > 0;
    }

    //2.5
    public static boolean is2Digits(int x) {
        return x > 9 && x/100 == 0;
    }

    //2.6
    public static boolean isUpperCase(char x) {
        return x > 64 && x < 91;
    }

    //2.7
    public static boolean isInRange(int a, int b, int num) {
        return num >= Math.min(a, b) && num <= Math.max(a, b);
    }

    //2.8
    public static boolean isDivisor (int a, int b) {
        return a%b == 0 || b%a == 0;
    }

    //2.9
    public static boolean isEqual (int a, int b, int c) {
        return a == b && a == c;
    }

    //2.10
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }

}
