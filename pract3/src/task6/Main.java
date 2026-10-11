package src.task6;

public class Main {
    // Конкретезация
    static Result<Integer> divide(int a, int b)
    {
        if (b == 0) {
            return Result.error("деление на ноль");
        }
        return Result.ok(a / b);
    }

    // Конкретезация
    static Result<String> hello(String name)
    {
        if (name == null || name.isBlank()) {
            return Result.error("Name is blank or null");
        }
        return Result.ok("Hello " + name);
    }

    public static void main(String[] args)
    {
        Result<Integer> r1 = divide(10, 2);
        Result<String> r2 = hello("Name");

        System.out.println(r1.getValue());
        System.out.println(r2.getValue());

        Result<Integer> bad = divide(1, 0);
        System.out.println(bad.isOk());
        System.out.println(bad.getError());

        // r1 = r2;
        // r2 = r1;
        // Не скомпилируется -> compile-time защита
    }
}
