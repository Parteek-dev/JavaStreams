import entity.Employee;
import entity.Student;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNbrOfEmpInEachDept {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Prateek",28,"Male","IT",2016,2300.3));
        list.add(new Employee(2,"Rahul",30,"Male","Freelance",2018,34.45));
        list.add(new Employee(3,"Yatin",35,"Female","MS365",2016,2345.66));
        list.add(new Employee(4,"Shri",34,"Male","Backup",2013,3456.34));
        list.add(new Employee(5,"Vipin",35,"Female","IT",2018,3456.34));

        //Given a list of employees, write a Java 8 code to count the number of employees in each department?

        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("count = "+collect);
        
        //Given a list of employees, find out the number of male and female employees in the organization?

        Map<String, Long> nbrOfMaleFemal = list.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("nbrOfMaleFemal = " + nbrOfMaleFemal);


    }
}
