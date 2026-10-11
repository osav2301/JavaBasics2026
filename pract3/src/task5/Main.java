package src.task5;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(10);
        list.add(123);
        list.add(323);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        try {
            for (Integer i : list) {
                if (3 == i) {
                    list.remove(i);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("CME: " + e);
        }
    }
}
