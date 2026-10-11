public class Main {
    public static void method1(String s)
    {
        System.out.println("Method1");
        method2(s);
    }
    public static void method2(String s)
    {
        System.out.println("Method2");
        method3(s);
    }
    public static void method3(String s)
    {
        System.out.println("Method3");
        method4(s);
    }
    public static void method4(String s)
    {
        if (s != null) // Исправление - проверка на null
            System.out.println(s.length());
    }

    public static void main(String[] args)
    {
        System.out.println("Start");
        method1(null);
    }
}
