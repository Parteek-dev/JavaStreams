import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetNumberStartsWithOne {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,23,4,12,5,15);


        var collect = list.stream().map(n -> Integer.toString(n)).filter(n -> n.startsWith("1")).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        List<String> collect1 = list.stream().flatMap(n -> Stream.of(Integer.toString(n)))
                                                .filter(n -> n.startsWith("1"))
                                                .collect(Collectors.toList());

        System.out.println("collect1 = " + collect1);

    }
}
