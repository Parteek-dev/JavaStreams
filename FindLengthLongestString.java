import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class FindLengthLongestString {

    public static void main(String[] args) {
        String[] list = {"Apple","Banana","Avocado","Apricot","Grapes"};

        //get length of longest String
        OptionalInt max = Stream.of(list).mapToInt(val -> val.length()).max();
        System.out.println("max = " + max);

        //other way to write
        Stream.of(list).mapToInt(String::length).max();



    }


}
