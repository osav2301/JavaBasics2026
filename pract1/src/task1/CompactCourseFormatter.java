package src.task1;

import src.Course;

public class CompactCourseFormatter implements CourseFormatter { @Override
	public String format(Course course) {
		return course.id() + " | " + course.title() + " | " + course.remainingHours() + "h left";
	}
}
