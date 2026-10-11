package task5;

class TestAutoClosable implements AutoCloseable {
    private final String name;
    private final boolean failOnClose;

    public TestAutoClosable(String name, boolean failOnClose)
    {
        this.name = name;
        this.failOnClose = failOnClose;
        System.out.println("[OPEN] " + name);
    }

    public void doWork(boolean throwException)
    {
        System.out.println("[USE] " + name);
        if (throwException) {
            throw new RuntimeException("Exception in doWork() " + name);
        }
    }

    @Override
    public void close() throws Exception
    {
        System.out.println("[CLOSE] " + name + "...");
        if (failOnClose) {
            throw new Exception("Exception in close() " + name);
        }
        System.out.println("[CLOSE] " + name + " Success");
    }
}
