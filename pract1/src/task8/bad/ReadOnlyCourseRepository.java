package src.task8.bad;

import src.Course;

public class ReadOnlyCourseRepository extends CourseRepository {
    @Override
    public void save(Course course)
    {
        throw new UnsupportedOperationException(
                "Read-only repository cannot save");
    }

    @Override
    public void deleteById(long id)
    {
        throw new UnsupportedOperationException(
                "Read-only repository cannot delete");
    }
}
