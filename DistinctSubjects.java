import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctSubjects {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul",1,"Math",98));
        list.add(new Student("Parteek",2,"Math",23.4));
        list.add(new Student("Peter",3,"C",34.56));
        list.add(new Student("Yatin",4,"C++",78.4));

        //Given a list of students, how do you get the subjects offered in the college
        //using set
        Set<String> subjects = list.stream().map(student -> student.getSubject()).collect(Collectors.toSet());
        System.out.println("subjects = " + subjects);

        Set<String> subjects2 = list.stream().map(Student::getSubject).collect(Collectors.toSet());
        System.out.println("subjects2= " + subjects2);

        //using distinct method
        List<String> subjects3 = list.stream().map(Student::getSubject).distinct().collect(Collectors.toList());
        System.out.println("subjects3= " + subjects3);
    }
}
