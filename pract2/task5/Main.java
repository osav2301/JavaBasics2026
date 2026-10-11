package task5;

public class Main {
    public static void main(String[] args)
    {
        // Successfull
        try (TestAutoClosable res = new TestAutoClosable("Res1", false)) {
            res.doWork(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // exception in doWork()
        try (TestAutoClosable res = new TestAutoClosable("Res2", false)) {
            res.doWork(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // exception in doWork() && close()
        try (TestAutoClosable res = new TestAutoClosable("Res3", true)) {
            res.doWork(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("supressed: " + t.getMessage());
            }
        }
    }
}
