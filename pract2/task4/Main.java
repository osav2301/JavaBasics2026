package task4;

public class Main {
    public static String getText()
    {
        try {
            return "From try block";
        } finally {
            return "From finally block";
        }
    }

    public static String swallowException()
    {
        try {
            throw new RuntimeException("Exception from try block");
        } finally {
            return "Exception swallen";
        }
    }

    public static String getException()
    {
        try {
            throw new RuntimeException("Exception from try block");
        } finally {
            throw new RuntimeException("Exception from finally block");
        }
        // return "Hello world";
        // Unreachable statement
    }

    public static void main(String[] args)
    {
        System.out.println(getText());

        try {
            System.out.println(swallowException());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getException());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
