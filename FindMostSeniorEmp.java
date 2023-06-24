import entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class FindMostSeniorEmp {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Prateek",28,"Male","IT",2016,2300.3));
        list.add(new Employee(2,"Rahul",30,"Male","Freelance",2018,34.45));
        list.add(new Employee(3,"Yatin",35,"Female","MS365",2016,2345.66));
        list.add(new Employee(4,"Shri",34,"Male","Backup",2013,3456.34));
        list.add(new Employee(5,"Vipin",35,"Female","IT",2018,3456.34));

        //Given a list of employees, how do you find out who is the senior most employee in the organization?

        //using minBy
        Optional<Employee> employeeOptional = list.stream().
                collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));

        Optional<Employee> employeeOptional2 = list.stream().
                collect(Collectors.minBy((a,b) -> a.getYearOfJoining() - b.getYearOfJoining()));

        Optional<Employee> employeeOptional1 = list.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();

        OptionalInt optionalInt = list.stream().mapToInt(Employee::getYearOfJoining).min();

        System.out.println("most senior employee = "+employeeOptional.get().getName());
        System.out.println("most senior employee = "+employeeOptional2.get().getName());

        System.out.println("most senior employee = "+employeeOptional1.get().getName());
        System.out.println("most senior employee = "+optionalInt.getAsInt());

        //Given a list of employees, get the details of the most youngest employee in the organization?

        Optional<Employee> optionalEmployee = list.stream().
                collect(Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining)));

        Employee employee = list.stream().sorted(Comparator.comparing(Employee::getYearOfJoining).reversed()).findFirst().get();

        var max = list.stream().mapToInt(Employee::getYearOfJoining).max().getAsInt();

        System.out.println("employee = " + employee.getName());
        System.out.println("employee = " + optionalEmployee.get().getName());
        System.out.println("max = " + max);
    }
}
