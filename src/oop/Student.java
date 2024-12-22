package oop;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] marks = new int[0];


    public Student(String name, int[] marks) {
        this.name = name;
        if (marks != null) this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(marks);
    }

    public static void main(String[] args) {
        //1.3.1
        // Необходимо выполнить следующие задачи:
        //1.	Создать студента Васю с оценками: 3,4,5.
        //2.	Создать студента Петю и скопировать оценки Васи,
        // присвоив содержимое поля с оценками Васи полю с оценками Пети.
        //3.	Заменить первую оценку Пети на число 5.
        // Вывести на экран строковое представление Васи и Пети. Объяснить результат
        //4.	Создать студента Андрея и скопировать ему оценки Васи так,
        // чтобы изменение оценок Васи не влияло на Андрея.
        Student student1 = new Student("Vasiliy", new int[]{2, 3, 4});
        Student student2 = new Student("Petr", student1.marks);
        Student student3 = new Student("Andrey", Arrays.copyOf(student1.marks, student1.marks.length));
        System.out.println(student1);
        System.out.println(student2);
        student1.marks[0] = 5;
        // произошла замена первой оценки у студентов 1 и 2, так как их переменные marks ссылались
        // на один и тот же объект - массив с оценками.
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        //1.4.7 Оба способа должны быть реализованы единственным конструктором. Создайте и выведите на экран следующие объекты:
        //1.	Студент Вася с оценками: 3,4,5.
        //2.	Студент Максим без оценок

        Student student01 = new Student("Vasiliy", new int[]{3, 4, 5});
        Student student02 = new Student("Maxim", null);
        System.out.println(student01);
        System.out.println(student02);


    }
}
