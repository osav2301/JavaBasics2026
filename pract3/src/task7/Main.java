package src.task7;

import java.util.*;
import java.util.function.Function;

public class Main {
    public static <T> T firstOrThrow(List<T> list)
    {
        if (list == null || list.isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return list.get(0);
    }

    public static <T> void swap(List<T> list, int i, int j)
    {
        if (i < 0 || j < 0 || i >= list.size() || j >= list.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static <T, K> Map<K, T> indexBy(List<T> list, Function<T, K> getKey)
    {
        Map<K, T> result = new HashMap<>();
        for (T item : list) {
            K key = getKey.apply(item);

            if (result.containsKey(key)) {
                throw new IllegalStateException(
                        "Конфликт ключей: ключ '" + key + "' уже используется");
            }
            result.put(key, item);
        }
        return result;
    }

    public static void main(String[] args)
    {
        List<String> names = List.of("Name1", "Name2", "Name3");
        System.out.println("First element:: " + firstOrThrow(names));

        try {
            firstOrThrow(new ArrayList<>());
        } catch (NoSuchElementException e) {
            System.out.println("Exception catched: " + e.getMessage());
        }

        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40));
        System.out.println(numbers.toString());
        swap(numbers, 0, 3);
        System.out.println("swapped: " + numbers.toString());

        List<String> words = List.of("apple", "car", "lamp");
        Map<Integer, String> byLength = indexBy(words, Main::ByLength);
        System.out.println("indexBy: " + byLength.toString());

        // Конфликт ключей
        List<String> wordsException = List.of("apple", "car", "tar");
        try {
            Map<Integer, String> byLengthException = indexBy(wordsException, Main::ByLength);
            System.out.println(byLengthException.toString());
        } catch (IllegalStateException e) {
            System.out.println("Exception catched: " + e.getMessage());
        }
    }

    public static Integer ByLength(String s)
    {
        if (s == null)
            return 0;
        return s.length();
    }
}
