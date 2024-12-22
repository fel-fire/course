package oop;

public class Human {
    Name name;
    int height;
    Human father;

    public Human(String name) {
        this.name = new Name(name);
    }

    public Human(Name name) {
        this.name = name;
    }

    public Human(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public Human(String name, Human father) {
        this.name = new Name(name);
        this.father = father;
    }

    public Human(Name name, Human father) {
        this.name = name;
        this.father = father;
    }

        public Human(Name name, Human father, int height) {
        this.name = name;
        this.height = height;
        this.father = father;
    }

    @Override
    public String toString() {
        if (father == null || father.name.firstName.isEmpty()) return String.format("%s, height: %d", name, height);

        String result = name.toString();
        if (name.lastName.isEmpty()) result = father.name.lastName + " " + result;
        if (name.patronymic.isEmpty()) result += " " + father.name.firstName + "ович";
        return result.trim() + ", height: " + height;
    }



    public static void main(String[] args) {

        //1.1.2 - 1.2.2 Необходимо создать и вывести на экран текстовое представление следующих людей:
        //•	Человек с именем “Клеопатра” и ростом 152
        //•	Человек с именем “Пушкин” и ростом 167
        //•	Человек с именем “Александр” и ростом 189

        Name name1 = new Name("Cleopatra");
        Name name2 = new Name("Vladimir", "Mayakovskiy");
        Name name3 = new Name("Alexander", "Sergeevich", "Pushkin");
        Human human1 = new Human(name1, 152);
        Human human2 = new Human(name2, 167);
        Human human3 = new Human(name3, 189);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        //1.2.3. Необходимо выполнить следующие задачи:
        //	Создать людей: Чудова Ивана, Чудова Петра, Бориса
        //	Сделать Ивана отцом Петра, а Петра отцом Бориса
        //	Вывести на экран строковое представление всех троих людей.

        Name name01 = new Name("Иван", "Чудов");
        Name name02 = new Name("Петр", "");
        Name name03 = new Name("Борис");

        Human human01 = new Human(name01, 152);
        Human human02 = new Human(name02, human01, 167);
        Human human03 = new Human(name03, human02, 189);

        System.out.println(human01);
        System.out.println(human02);
        System.out.println(human03);

        //1.4.6 Создайте и выведите на экран следующие объекты:
        //1.	Человека с именем Лев (в виде строки)
        //2.	Человека с именем Пушкин Сергей (как Имя) и отцом Львом (предыдущий Человек)
        //3.	Человека с именем Александр (в виде строки) и отцом Сергеем (предыдущий Человек)

        Human human001 = new Human("Лев");
        System.out.println(human001);
        Name name4 = new Name("Сергей", "Пушкин");
        Human human003 = new Human(name4, human001);
        System.out.println(human003);
        Human human002 = new Human("Александр", human003);
        System.out.println(human002);


    }
}
