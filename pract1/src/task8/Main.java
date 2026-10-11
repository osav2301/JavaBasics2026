package src.task8;

import src.Course;

public class Main {
    public static void main(String[] args)
    {
        WritableCourseRepository writable = new SimpleCourseRepository();
        writable.save(new Course(1, "Java", 10));
        writable.findById(1);

        CourseRepository readOnly = new ReadOnlyCourseRepository();
        readOnly.findById(1);

        // Ошибка компиляции
        // readOnly.save(new Course(2, "SQL", 20));
    }
}
