public class Block3 {

    //3.1
    public static int abs(int x) {
        return Math.abs(x);
    }

    //3.2
    public static int safeDiv(int x, int y) {
        return y != 0 ? x / y : 0;
    }

    //3.3
    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    //3.4
    public static String makeDecision(int x, int y) {
        String result;
        if (x > y) result = String.format("%d > %d", x, y);
        else if (x < y) result = String.format("%d < %d", x, y);
        else result = String.format("%d == %d", x, y);
        return result;
    }

    //3.5
    public static int max3(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    //3.6
    public static boolean sum3(int x, int y, int z) {
        return x + y == z || y + z == x || z + x == y;
    }

    //3.7
    public static int sum2(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum < 20 ? 20 : sum;
    }

    //3.8
    public static boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) && x % 15 > 0;
    }

    //3.9
    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || x + y == 6 || Math.max(x, y) - Math.min(x, y) == 6;
    }

    //3.10
    public static String age(int x) {
        if (x < 0) return "Возраст не может быть отрицательным";

        String result = x + " ";
        if (x != 11 && x % 10 == 1) result += "год";
        else if ((x < 11 || x > 14) && (x % 10 > 0 && x % 10 < 5)) result += "года";
        else result += "лет";
        return result;
    }

    //3.11
    public static String day(int x) {
        String result = switch (x) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Это не день недели";
        };
        return result;
    }

    //3.12
    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }
}
