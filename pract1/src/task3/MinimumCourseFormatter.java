package src.task3;

import src.Course;

public class MinimumCourseFormatter implements CourseFormatter {
	@Override
	public String format(Course course) {
		return course.id() + ": " + course.completedHours() + "/" + course.durationHours();
	}
}
