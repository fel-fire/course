package oop;

public class Name {
    String firstName;
    String lastName = "";
    String patronymic = "";

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName, String patronymic) {
        this(firstName, lastName);
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", lastName, firstName, patronymic).trim();
    }

    public static void main(String[] args) {
        // 1.1.3 Необходимо создать и вывести на экран текстовое представление следующих имен:
        //•	Клеопатра
        //•	Пушкин Александр Сергеевич
        //•	Маяковский Владимир

        //1.4.5 Необходимо создать следующие имена:
        //1.	Клеопатра
        //2.	Александр Сергеевич Пушкин
        //3.	Владимир Маяковский
        //4.	Христофор Бонифатьевич (здесь Христофор это имя, а Бонифатьевич - фамилия)

        Name name1 = new Name("Cleopatra");
        Name name2 = new Name("Vladimir", "Mayakovskiy");
        Name name3 = new Name("Alexander",  "Pushkin", "Sergeevich");
        Name name4 = new Name("Христофор", "Бонифатьевич");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
