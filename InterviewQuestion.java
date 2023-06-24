import entity.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewQuestion {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Prateek",28,"Male","IT",2016,2300.3));
        list.add(new Employee(2,"Rahul",30,"Male","Freelance",2018,34.45));
        list.add(new Employee(3,"Yatin",35,"Female","MS365",2016,2345.66));
        list.add(new Employee(4,"Shri",34,"Male","Backup",2013,3456.34));
        list.add(new Employee(5,"Vipin",35,"Female","IT",2018,3456.34));

        //get sum of salary whose age > 30 - 1st way
        Double sumOfSal = list.stream().filter(e -> e.getAge() > 30).collect(Collectors.summingDouble(e -> e.getSalary()));
        System.out.println("sumOfSal = " + sumOfSal);

        //2nd way
        double sum = list.stream().filter(e -> e.getAge() > 30).mapToDouble(e -> e.getSalary()).sum();
        System.out.println("sum = " + sum);


        //get all number starts with 1
        List<Integer> listNbrs = Arrays.asList(1,2,3,4,5,23,4,12,5,15);
        var collect = listNbrs.stream().map(n -> Integer.toString(n)).filter(n -> n.startsWith("1")).collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }
}