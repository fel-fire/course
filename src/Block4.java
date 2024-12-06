public class Block4 {

    //4.1
    public static String listNums(int x) {
        String out = "";
        for (int i = 0; i <= x; i++) {
            out += i + " ";
        }
        return out;
    }

    //4.2
    public static String reverseListNums(int x) {
        String out = "";
        for (int i = x; i >= 0; i--) {
            out += i + " ";
        }
        return out;
    }

    //4.3
    public static String chet(int x) {
        String out = "";
        for (int i = 0; i <= x; i += 2) {
            out += i + " ";
        }
        return out;
    }

    //4.4
    public static int pow(int x, int y) {
        if (x == 0 || y < 0) return 0;         //для возведения в отрицательную степень метод не реализован )

        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    //4.5
    public static int numLen(long x) {
        if (x == 0) return 1;

        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    //4.6
    public static boolean equalNum(int x) {
        int lastNumber = x % 10;
        while ((x /= 10) != 0) {
            if (x % 10 != lastNumber) return false;
        }
        return true;
    }

    //4.7
    public static void square(int x) {
        if (x <= 0) return;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //4.8
    public static void leftTriangle(int x) {
        if (x <= 0) return;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //4.9
    public static void rightTriangle(int x) {
        if (x <= 0) return;

        for (int i = 1; i <= x; i++) {
            System.out.print(" ".repeat(x - i) + "*".repeat(i));
            System.out.println();
        }
    }

    //4.10
    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");

        while (true) {
            int x = sc.nextInt();
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                break;
            }
        }

    }
}
