package oop;

public class House {
    private final int floors;

    public House(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        String outputPhrase = String.format("Дом с %d этаж", floors);
        return floors%10 == 1 ? outputPhrase + "ом" : outputPhrase + "ами";
    }

    public static void main(String[] args) {

        //1.1.5 У Дома можно запросить текстовую форму, которое имеет представление вида “дом с N этажами”,
        // где N это число. Гарантировать правильное окончание фразы, в зависимости от количества этажей.
        // Создать и вывести на экран дома с 1, 5, 23 этажами.
        House house1 = new House(1);
        House house2 = new House(5);
        House house3 = new House(24);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);

        //1.4.4 Создайте и выведите на экран дома с 2, 35, 91 этажами. Продемонстрируйте
        // на примере что дому нельзя заменить количество этажей.
        House house01 = new House(2);
        House house02 = new House(35);
        House house03 = new House(91);
        System.out.println(house01);
        System.out.println(house02);
        System.out.println(house03);
        //house01.floors = 5; - ошибка

    }



}
