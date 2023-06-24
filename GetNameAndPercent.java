import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GetNameAndPercent {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul",1,"Math",98));
        list.add(new Student("Parteek",2,"SST",23.4));
        list.add(new Student("Peter",3,"C",34.56));
        list.add(new Student("Yatin",4,"C++",78.4));

        //Given a list of students, how do you get the name and percentage of each student?
        Map<String, Double> map = list.stream().collect(Collectors.toMap(student -> student.getName(), student -> student.getPercentage()));
        System.out.println("map = " + map);

        //using method reference
        Map<String, Double> map2 = list.stream().collect(Collectors.toMap(Student::getName,Student::getPercentage));
        System.out.println("map = " + map2);
    }
}
