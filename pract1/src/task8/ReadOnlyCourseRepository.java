package src.task8;

import src.Course;

public class ReadOnlyCourseRepository implements CourseRepository {
    @Override
    public Course findById(long id)
    {
        System.out.println("reading (read-only) by id: " + id);
        return null;
    }
}
