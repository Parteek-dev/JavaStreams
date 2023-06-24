import entity.Student;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class GetNbrOfStudents {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul",1,"Math",98));
        list.add(new Student("Parteek",2,"Math",23.4));
        list.add(new Student("Peter",3,"C",34.56));
        list.add(new Student("Yatin",4,"C++",78.4));

        //How do you get total number of students from the given list of students

        //counting returns wrapper class object
        Long count1 = list.stream().collect(Collectors.counting());

        //use map to int , it returns IntStream
        long count2 = list.stream().mapToInt(s -> s.getId()).count();


        System.out.println("count 1 = "+count1);
        System.out.println("count 2 = "+count2);

    }
}
