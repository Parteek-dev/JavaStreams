import java.util.Arrays;

public class ProductOfAllElementsExceptCurrent {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};


        int[] ints = Arrays.stream(arr).
                map(i -> Arrays.stream(arr).filter(j -> j != i).reduce(1, (a, b) -> a * b)).toArray();
        System.out.println("ints = " + Arrays.toString(ints));


    }
}
