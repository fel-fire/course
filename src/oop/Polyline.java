package oop;

import java.util.Arrays;

public class Polyline {
    Point[] points;

    public Polyline() {
    }

    public Polyline(Point... points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polyline " + Arrays.toString(points);
    }

    public static void main(String[] args) {

        //1.3.2 Необходимо выполнить следующие задачи:
        //1.	Создать первую Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}
        //2.	Создайте вторую Ломаную, чья первая и последняя Точка совпадает с таковыми у первой Ломаной,
        // но в качестве середины имеет точки: {2,-5}, {4,-8}
        //3.	Сдвиньте начало первой Ломаной таким образом, чтобы одновременно сдвинулось начало второй Ломаной.
        Point point1 = new Point(7, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 9);
        Polyline polyline1 = new Polyline(point1, point2, point3);
        System.out.println(polyline1);

        Point point4 = new Point(2, -5);
        Point point5 = new Point(4, -8);
        Polyline polyline2 = new Polyline(point1, point4, point5, point3);
        System.out.println(polyline2);

/*        1.4.3 Рисуем Ломаную линию. Измените сущность Ломаная из задачи 1.3.2. Необходимо уметь создавать Ломаные линии указывая следующие комбинации параметров:
•	Без параметров
•	С указанием набора Точек
        Создайте Ломаную через точки {3;5}, {25;6}, {7;8}*/

        Polyline polyline3 = new Polyline(new Point(3, 5), new Point(25, 6), new Point(7, 8));
        Polyline polyline4 = new Polyline();
        polyline4.points = new Point[] {new Point(3, 5), new Point(25, 6), new Point(7, 8)};
        System.out.println(polyline3);
        System.out.println(polyline4);



    }
}
