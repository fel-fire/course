package oop;

import java.util.Arrays;

public class Town {
    String name;
    Way[] ways;

    public Town(String name) {
        this.name = name;
    }

    public Town(String name, Way... ways) {
        this.name = name;
        this.ways = ways;
    }

    @Override
    public String toString() {
        return name + " " + Arrays.toString(ways);
    }

    public static void main(String[] args) {
        Town a = new Town("A");
        Town b = new Town("B");
        Town c = new Town("C");
        Town d = new Town("D");
        Town e = new Town("E");
        Town f = new Town("F");

        a.ways = new Way[3];
        a.ways[0] = new Way(b, 5);
        a.ways[1] = new Way(f, 1);
        a.ways[2] = new Way(d, 6);

        b.ways = new Way[3];
        b.ways[0] = new Way(a, 5);
        b.ways[1] = new Way(f, 1);
        b.ways[2] = new Way(c, 3);

        c.ways = new Way[2];
        c.ways[0] = new Way(b, 3);
        c.ways[1] = new Way(d, 4);

        d.ways = new Way[3];
        d.ways[0] = new Way(a, 6);
        d.ways[1] = new Way(e, 2);
        d.ways[2] = new Way(c, 4);

        e.ways = new Way[2];
        e.ways[0] = new Way(d, 2);
        e.ways[1] = new Way(f, 2);

        f.ways = new Way[3];
        f.ways[0] = new Way(a, 1);
        f.ways[1] = new Way(b, 1);
        f.ways[2] = new Way(e, 2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


        Town g = new Town("G");
        Town h = new Town("H");
        Town i = new Town("I", new Way(g, 7), new Way(h, 15));
        System.out.println(i);
    }
}

class Way {
    Town townTo;
    int costs;

    public Way(Town townTo, int costs) {
        this.townTo = townTo;
        this.costs = costs;
    }

    @Override
    public String toString() {
        return townTo.name + ":" + costs;
    }
}
