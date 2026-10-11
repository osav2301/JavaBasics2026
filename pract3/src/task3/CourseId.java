package src.task3;

import java.util.Objects;

public class CourseId {
    private final long id;

    public CourseId(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null || getClass() != other.getClass())
            return false;
        return Objects.equals(id, ((CourseId)other).id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    @Override
    public String toString()
    {
        return "" + id;
    }
}
