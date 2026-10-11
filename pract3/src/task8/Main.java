package src.task8;

import java.util.*;

public class Main {
    // Сравним с любым предком
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> values)
    {
        Objects.requireNonNull(values, "values is null");

        Iterator<? extends T> it = values.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("empty collection");
        }

        T max = it.next();

        while (it.hasNext()) {
            T current = it.next();
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }

        return max;
    }

    static final class Money implements Comparable<Money> {
        private final int amount;

        Money(int amount)
        {
            this.amount = amount;
        }

        @Override
        public int compareTo(Money other)
        {
            return Integer.compare(this.amount, other.amount);
        }

        @Override
        public String toString()
        {
            return "Money: " + amount;
        }
    }

    static class Base implements Comparable<Base> {
        final int value;

        Base(int value)
        {
            this.value = value;
        }

        @Override
        public int compareTo(Base other)
        {
            return Integer.compare(this.value, other.value);
        }

        @Override
        public String toString()
        {
            return getClass().getSimpleName() + "(" + value + ")";
        }
    }

    static class Sub extends Base {
        Sub(int value)
        {
            super(value);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(max(Arrays.asList(3, 1, 4, 2)));

        System.out.println(max(Arrays.asList("apple", "cat", "cat")));

        System.out.println(max(Arrays.asList(new Money(10), new Money(50), new Money(30))));

        // Sub наследует Comparable<Base>, а не Comparable<Sub>
        List<Sub> subs = Arrays.asList(new Sub(1), new Sub(9), new Sub(5));
        Base maxSub = max(subs);
        System.out.println(maxSub);
    }
}
