package src.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import src.Course;

public class Main {
    public static Map<CourseId, Course> buildIndex(List<Course> courses)
    {
        Map<CourseId, Course> index = new HashMap<>();
        for (Course c : courses) {
            Course prev = index.putIfAbsent(new CourseId(c.id()), c);
            if (prev != null) {
                System.out.println("Duplicate CourseId: " + c.id());
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        List<Course> list = List.of(
                new Course(1, "java", 124),
                new Course(2, "math", 145),
                new Course(3, "phys", 50),
                new Course(2, "math", 145),
                new Course(4, "java", 200));
        Map<CourseId, Course> index = buildIndex(list);
        System.out.println(index.toString());
    }
}
