package src.task4;

import java.util.Random;
import src.Student;

public class Main {
    public static void main(String[] args)
    {
        FifoWaitList queue = new FifoWaitList();
        Student student;
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            student = new Student(Math.abs(random.nextInt() % 100), "");
            queue.add(student);
        }

        queue.add();
    }
}
