import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateStringInArray {
    public static void main(String[] args) {

        String[] list = {"Apple","Banana","Apple","Apricot","Grapes"};


        //remove duplicates from an array of strings while preserving the original order
        List<String> collect = Arrays.stream(list).distinct().collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }

}
