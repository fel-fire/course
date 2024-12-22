package oop;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(long seconds) {
        this.seconds = (int)seconds%60;
        this.minutes = (int)seconds/60%60;
        this.hours = (int)seconds/3600%24;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // 1.1.4 Необходимо создать и вывести на экран текстовую форму для следующих вариантов времени:
        //•	10 секунд
        //•	10000 секунд
        //•	100000 секунд

        Time time1 = new Time(10);
        Time time2 = new Time(12000);
        Time time3 = new Time(91800);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
