package src.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>(10);
        list.add(123);
        list.add(323);
        list.add(3);
        for (int i : list) {
            System.out.println(i);
        }
        for (int i : list) {
            System.out.println(i);
        }

        int n = 500_000;

        List<Integer> array = new ArrayList<>(n);
        List<Integer> linked = new java.util.LinkedList<>();

        for (int i = 0; i < n; i++) {
            array.add(i);
            linked.add(i);
        }

        int[] indices = new Random(0).ints(5000, 0, n).toArray();

        long arrayIndexTime = measureIndexAccess(array, indices);
        long linkedListIndexTime = measureIndexAccess(linked, indices);
        long arrayTraversalTime = measureTraversal(array);
        long linkedListTraversalTime = measureTraversal(linked);

        System.out.printf(
                "index:     ArrayList=%d ms, LinkedList=%d ms%n",
                arrayIndexTime / 1_000_000,
                linkedListIndexTime / 1_000_000);
        System.out.printf(
                "traversal: ArrayList=%d ms, LinkedList=%d ms%n",
                arrayTraversalTime / 1_000_000,
                linkedListTraversalTime / 1_000_000);
    }

    static long measureIndexAccess(List<Integer> list, int[] indices)
    {
        long start = System.nanoTime();
        long sum = 0;
        for (int idx : indices) {
            int value = list.get(idx);
            sum += value;
        }
        long end = System.nanoTime();
        if (sum == -1)
            System.out.print("");
        return end - start;
    }

    static long measureTraversal(List<Integer> list)
    {
        long start = System.nanoTime();
        long sum = 0;
        for (Object obj : list) {
            int value = (Integer)obj;
            sum += value;
        }
        long end = System.nanoTime();
        if (sum == -1)
            System.out.print("");
        return end - start;
    }
}
