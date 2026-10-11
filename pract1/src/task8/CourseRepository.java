package src.task8;

import src.Course;

public interface CourseRepository {
    Course findById(long id);
}
