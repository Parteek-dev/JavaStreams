import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBySubjects {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul",1,"Math",98));
        list.add(new Student("Parteek",2,"Math",23.4));
        list.add(new Student("Peter",3,"C",34.56));
        list.add(new Student("Yatin",4,"C++",78.4));

        //How do you get the students grouped by subject from the given list of students?

        //{C++=1, C=1, Math=2}
        Map<String, Long> subjectsGroup1 = list.stream().collect(Collectors.groupingBy(Student::getSubject, Collectors.counting()));

        //{C++=1, C=1, Math=2}
        Map<String, Long> subjectsGroup2 = list.stream().collect(Collectors.groupingBy(s -> s.getSubject(), Collectors.counting()));

        //subjectsGroup1 way 3= {C++=[Yatin-4-C++-78.4], C=[Peter-3-C-34.56], Math=[Rahul-1-Math-98.0, Parteek-2-Math-23.4]}
        Map<String, List<Student>> subjectsGroup3 = list.stream().collect(Collectors.groupingBy(Student::getSubject));

        // return {false=2, true=2}
        var collect = list.stream().collect(Collectors.partitioningBy(s -> s.getPercentage() > 50,Collectors.counting()));

        //return like {false=[Parteek-2-Math-23.4, Peter-3-C-34.56], true=[Rahul-1-Math-98.0, Yatin-4-C++-78.4]}
        var collect1 = list.stream().collect(Collectors.partitioningBy(s -> s.getPercentage() > 50));

        //return count after filtering = 2
        var collect2 = list.stream().collect(Collectors.filtering(s -> s.getPercentage() > 50,Collectors.counting()));


        System.out.println("subjectsGroup way 1 = "+subjectsGroup1);
        System.out.println("subjectsGroup1 way 2 = "+subjectsGroup1);
        System.out.println("subjectsGroup1 way 3= "+subjectsGroup3);
        System.out.println("collect = " + collect);
        System.out.println("collect1 = " + collect1);
        System.out.println("collect2 = " + collect2);
    }
}