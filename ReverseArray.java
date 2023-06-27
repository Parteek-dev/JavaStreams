import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {5,2,8,3,1};

        IntStream.range(0,arr.length/2).forEach(i -> {

            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        });

        System.out.println("arr = " + Arrays.toString(arr));
    }
}
