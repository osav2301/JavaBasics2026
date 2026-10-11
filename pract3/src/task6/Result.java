package src.task6;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Function;

public class Result<T> {
    private final boolean ok;
    private final T value;
    private final String error;

    private Result(boolean ok, T value, String error)
    {
        this.ok = ok;
        this.value = value;
        this.error = error;
    }

    public static <T> Result<T> ok(T value)
    {
        if (value == null) {
            throw new IllegalArgumentException("value не может быть null");
        }
        return new Result<>(true, value, null);
    }

    public static <T> Result<T> error(String error)
    {
        if (error == null) {
            throw new IllegalArgumentException("error не может быть null");
        }
        return new Result<>(false, null, error);
    }

    public boolean isOk()
    {
        return ok;
    }

    public T getValue()
    {
        if (!ok) {
            throw new IllegalStateException("Error -> cant get value: " + error);
        }
        return value;
    }

    public String getError()
    {
        if (ok) {
            throw new IllegalStateException("Success -> cant get error");
        }
        return error;
    }
}
