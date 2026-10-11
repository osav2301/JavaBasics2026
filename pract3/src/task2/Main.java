package src.task2;
import java.util.*;

public class Main {
    public static List<CourseCode> removeDuplicates(List<CourseCode> input)
    {
        Set<CourseCode> seen = new LinkedHashSet<>();
        List<CourseCode> result = new ArrayList<>();

        for (CourseCode c : input) {
            if (seen.add(c)) {
                result.add(c);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        List<CourseCode> courses = List.of(
                new CourseCode("java"),
                new CourseCode("math"),
                new CourseCode("phys"),
                new CourseCode("math"),
                new CourseCode("java"));
        System.out.println(removeDuplicates(courses));
    }
}
