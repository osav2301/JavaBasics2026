package src.task2;

import java.util.Objects;

public class CourseCode {
    private final String code;

    public CourseCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null || getClass() != other.getClass())
            return false;
        return Objects.equals(code, ((CourseCode)other).code);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(code);
    }

    @Override
    public String toString()
    {
        return code;
    }
}
