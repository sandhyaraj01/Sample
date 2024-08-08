package org.example;

public class StaticCounter {

    private static int count;

    public StaticCounter() {
        count++;
    }

    public void getCounter() {
        System.out.println("count:" + count);
    }

    public static void main(String[] args) {

        StaticCounter sc1 = new StaticCounter();
        sc1.getCounter();

        StaticCounter sc2 = new StaticCounter();
        sc2.getCounter();

        sc1.getCounter();

    }
}
