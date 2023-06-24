import entity.Student;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SummaryStatistics {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Rahul",1,"Math",98));
        list.add(new Student("Parteek",2,"Math",23.4));
        list.add(new Student("Peter",3,"C",34.56));
        list.add(new Student("Yatin",4,"C++",78.4));

        //Given a list of students, write a Java 8 code to get highest, lowest and average percentage of students?

        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(s -> s.getPercentage()));
        double min = statistics.getMin();
        double max = statistics.getMax();
        double sum = statistics.getSum();
        double average = statistics.getAverage();
        long count = statistics.getCount();


        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        System.out.println("sum = "+sum);
        System.out.println("average = "+average);
        System.out.println("count = "+count);
    }
}
