package src.task3;

import src.Course;

public class DetailedCourseFormatter implements CourseFormatter {
	@Override
	public String format(Course course) {
		return "id=" + course.id()
			+ "\ntitle=\"" + course.title() + "\""
			+ "\nduration=" + course.durationHours() + "h"
			+ "\ncompleted=" + course.completedHours() + "h"
			+ "\nremaining=" + course.remainingHours() + "h"
			+ "\nfinished=" + course.isCompleted();
	}
}
