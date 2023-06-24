import entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountAvgSalOfEmpForEachGender {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Prateek",28,"Male","IT",2016,2300.3));
        list.add(new Employee(2,"Rahul",30,"Male","Freelance",2018,34.45));
        list.add(new Employee(3,"Yatin",35,"Female","MS365",2016,2345.66));
        list.add(new Employee(4,"Shri",34,"Male","Backup",2013,3456.34));
        list.add(new Employee(5,"Vipin",35,"Female","IT",2018,3456.34));

        //Given a list of employees, find out the average salary of male and female employees?

        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(e->e.getGender(),
                Collectors.averagingDouble(e->e.getSalary())));

        Map<String, Double> collect2 = list.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("avg sal by each gender way 1 = "+collect);
        System.out.println("avg sal by each gender way 2 = "+collect2);

        //Write the Java 8 code to get the average age of each department in an organization?

        Map<String, Double> avgAgeByDept = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));
        System.out.println("avg age by dept  = "+avgAgeByDept);


    }
}
