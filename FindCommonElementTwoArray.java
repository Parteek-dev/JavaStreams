import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,1};
        int[] arr2 = {2,34,4,1,3,8};


        var commonList = Arrays.stream(arr1). //array 1 stream
                filter(arr1nbr -> //filter array 1 element
                Arrays.stream(arr2).anyMatch(arr2Nbr -> arr2Nbr == arr1nbr)) // compare arr1 with arr2
                .boxed().collect(Collectors.toList());
        System.out.println("commonList = " + commonList);

    }
}
