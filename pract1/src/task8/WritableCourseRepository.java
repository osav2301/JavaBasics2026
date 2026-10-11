package src.task8;

import src.Course;

public interface WritableCourseRepository extends CourseRepository {
    void save(Course course);
    void deleteById(long id);
}
