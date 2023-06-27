import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondSmallestElement {

    public static void main(String[] args) {
        int[] arr = {5,2,8,3,1};


        //my way
        var max = Arrays.stream(arr).sorted().limit(2).max();
        System.out.println("max = " + max);

        //another way
        var first = Arrays.stream(arr).sorted().skip(1).findFirst();
        System.out.println("first = " + first);

    }
}
