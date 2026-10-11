package task3;

public class EnrollmentRejectedException extends Exception {
    private final int studentId;
    private final int courseId;
    private final int reasonCode;

    public EnrollmentRejectedException(String message, int studentId, int courseId, int reasonCode)
    {
        super(message);
        this.studentId = studentId;
        this.courseId = courseId;
        this.reasonCode = reasonCode;
    }

    public EnrollmentRejectedException(
            String message, Throwable cause, int studentId, int courseId, int reasonCode)
    {
        super(message, cause);
        this.studentId = studentId;
        this.courseId = courseId;
        this.reasonCode = reasonCode;
    }

    @Override
    public String toString()
    {
        return "msg: " + getMessage() + "; cause: " + getCause().toString();
    }
}
