package oop;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + "; " + y + "}";
    }

    public static void main(String[] args) {

        //1.1.1. Необходимо создать три точки с разными координатами и вывести на экран их текстовое представление.
        Point point1 = new Point(3, 5);
        Point point2 = new Point(5, 7);
        Point point3 = new Point(9, 11);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);

        //1.4.1 Необходимо выполнить следующие задачи:
        //1.	Создайте и выведите на экран точку с координатами 3;5
        //2.	Создайте и выведите на экран точку с координатами 25;6
        //3.	Создайте и выведите на экран точку с координатами 7;8

        Point point01 = new Point(3, 5);
        Point point02 = new Point(25, 6);
        Point point03 = new Point(7, 8);
        System.out.println(point01);
        System.out.println(point02);
        System.out.println(point03);

    }
}
