import entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HighestPaidEmployee {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Prateek",28,"Male","IT",2016,2300.3));
        list.add(new Employee(2,"Rahul",30,"Male","Freelance",2018,34.45));
        list.add(new Employee(3,"Yatin",35,"Female","MS365",2016,2345.66));
        list.add(new Employee(4,"Shri",34,"Male","Backup",2013,3456.34));
        list.add(new Employee(5,"Vipin",35,"Female","IT",2018,3456.34));

       //Write a Java 8 code to get the details of highest paid employee in the organization from the given list of employees?

        Employee employee = list.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();

        OptionalDouble optionalDouble = list.stream().mapToDouble(Employee::getSalary).max();

        System.out.println("max sal way 1 = "+employee.getSalary());
        System.out.println("max sal way 2 = "+optionalDouble.getAsDouble());

    }
}
