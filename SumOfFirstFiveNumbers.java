import entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfFirstFiveNumbers {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(0, 5).sum();
        System.out.println("sum = " + sum);

        IntStream.rangeClosed(0,5).peek(System.out::println);
        //IntStream.rangeClosed(0,5).forEach(System.out::println);

    }
}
