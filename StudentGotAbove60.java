import entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGotAbove60 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul",1,"Math",98));
        list.add(new Student("Parteek",2,"SST",23.4));
        list.add(new Student("Peter",3,"C",34.56));
        list.add(new Student("Yatin",4,"C++",78.4));

        //Given a list of students, write a
        // Java 8 code to partition the students who got above 60% from those who didn’t?
        Map<Boolean, List<Student>> listMap =
                list.stream().collect(Collectors.partitioningBy(student -> student.getPercentage() > 60));

        //
        Map<Boolean, List<Student>> listMap1 =
        list.stream().collect(Collectors.groupingBy(student -> student.getPercentage() > 60));

        //using filter
        var collect = list.stream().filter(s -> s.getPercentage() > 60).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        //using filtering
        var collect1 = list.stream().collect(Collectors.filtering(s -> s.getPercentage() > 60, Collectors.toList()));
        System.out.println("collect1 = " + collect1);

        System.out.println(listMap);
        System.out.println(listMap1);

    }
}
