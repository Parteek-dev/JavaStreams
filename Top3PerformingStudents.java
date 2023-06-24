import entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3PerformingStudents {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul",1,"Math",98));
        list.add(new Student("Parteek",2,"SST",23.4));
        list.add(new Student("Peter",3,"C",34.56));
        list.add(new Student("Yatin",4,"C++",78.4));

        //48) Given a list of students, write a Java 8 code to get the names of top 3 performing students?
        //we cannot use compareTo method because Double class not implements Comparable
        //general comparing
        List<Student> studentList1 = list.stream()
                .sorted(Comparator.comparing(Student::getPercentage).reversed()).
                limit(3).collect(Collectors.toList());

        //comparingDouble
        list.stream().sorted(Comparator.comparingDouble(Student::getPercentage)).
                limit(3).collect(Collectors.toList());
        System.out.println("studentList1 = " + studentList1);

        //here we can use compareTo method
        List<Student> studentList2 = list.stream().
                sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).
                limit(3).collect(Collectors.toList());

        System.out.println(studentList1);
        System.out.println(studentList2);
    }
}
