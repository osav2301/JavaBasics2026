package task3;

public class Main {
    public static void npe()
    {
        String s = null;
        s.length();
    }

    public static void Enroll() throws EnrollmentRejectedException
    {
        try {
            npe();
        } catch (Exception e) {
            throw new EnrollmentRejectedException("Не прошел по возрасту", e, 1, 1, 1);
        }
    }

    public static void main(String[] args)
    {
        try {
            Enroll();
        } catch (EnrollmentRejectedException e) {
            System.out.println(e.toString());
        }
    }
}
