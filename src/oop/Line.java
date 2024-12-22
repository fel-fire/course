package oop;

import java.util.Arrays;

public class Line {
    public Point startPoint;
    public Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(int x1, int y1, int x2, int y2) {
        startPoint = new Point(x1, y1);
        endPoint = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return "Line from " + startPoint + " to " + endPoint;
    }

    public static void main(String[] args) {

     /* 1.2.1. Создайте линии со следующими характеристиками
        1.	Линия 1 с началом в т. {1;3} и концом в т.{23;8}.
        2.	Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
        3.	Линия 3, которая начинается всегда там же где начинается линия 1, и заканчивается всегда там же, где заканчивается линия 2. Таким образом, если положение первой или второй линии меняется, то меняется и третья линия.
        4.	После создания всех трех объектов измените координаты первой и второй линий, причем сделайте это таким образом, чтобы положение третьей линии соответствовало требованиям пункта 3.
        5.	Измените координаты первой линии так, чтобы при этом не изменились, координаты третьей линии.*/
        Point point01 = new Point(7, 12);
        Point point02 = new Point(30, 48);
        Point point03 = new Point(15, 110);
        Point point04 = new Point(55, 110);

        Line line1 = new Line(point01, point02);
        Line line2 = new Line(point03, point04);
        Line line3 = new Line(point01, point04);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        line1.startPoint = new Point(78, 34);
        System.out.println(line1);
        System.out.println(line3);

        //1.4.2 Создайте Линии со следующими характеристиками:
        //1.	Линия 1 с началом в т. {1;3} и концом в {23;8}.
        //2.	Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.
        //3.	Линия 3 которая начинается всегда там же где начинается линия 1,
        // и заканчивается всегда там же, где заканчивается линия 2.

        Line line01 = new Line(new Point(1, 5), new Point(23, 8));
        Line line02 = new Line(5, 10, 40, 10);
        Line line03 = new Line(line01.startPoint, line02.endPoint);
        System.out.println(line01);
        System.out.println(line02);
        System.out.println(line03);

    }
}
