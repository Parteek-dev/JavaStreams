import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAccordingToNameLength {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");

        List<String> list = names.stream().sorted((a,b) -> b.length() - a.length()).collect(Collectors.toList());

        List<String> longestname = names.stream().sorted((a,b) -> b.length() - a.length()).limit(1).collect(Collectors.toList());
        System.out.println("longestname = " + longestname);

        List<String> shortestName = names.stream().sorted((a,b) -> b.length() - a.length()).skip(names.size()-1).collect(Collectors.toList());
        System.out.println("shortestName = " + shortestName);

        System.out.println(list);
    }
}