package src.task4;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;
import src.Student;

public class FifoWaitList {
    private final Queue<Student> queue = new ArrayDeque<>();

    public void add(Student person)
    {
        queue.add(person); // бросит исключение, если добавить нельзя
    }

    public boolean offer(Student person)
    {
        return queue.offer(person); // вернёт false, если добавить нельзя
    }

    public Student elementNext()
    {
        return queue.element(); // NoSuchElementException, если пусто
    }

    public Student peekNext()
    {
        return queue.peek(); // null, если пусто
    }

    public Student removeNext()
    {
        return queue.remove(); // NoSuchElementException, если пусто
    }

    public Student pollNext()
    {
        return queue.poll(); // null, если пусто
    }

    public Optional<Student> pollNextOptional()
    {
        return Optional.ofNullable(queue.poll());
    }

    public Student processNext()
    {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public int size()
    {
        return queue.size();
    }
}
