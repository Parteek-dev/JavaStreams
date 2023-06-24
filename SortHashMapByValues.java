import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortHashMapByValues {

    public static void main(String[] args) {

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("1",4);
        map1.put("2",3);
        map1.put("3",0);
        map1.put("4",10);
        map1.put("5",-1);

        ArrayList<Map.Entry<String,Integer>> entryList = new ArrayList<>(map1.entrySet());

        //1st way
        Collections.sort(entryList, (o1,o2) -> o1.getValue().compareTo(o2.getValue()));

        Map<String,Integer> temp = new LinkedHashMap<>();

        for(Map.Entry<String,Integer> me : entryList){
            temp.put(me.getKey(), me.getValue());
        }

        System.out.println(temp);

        //2nd way - streams
        LinkedHashMap<String, Integer> map = entryList.stream().sorted(((o1, o2) -> o1.getValue().compareTo(o2.getValue())))
                .collect(Collectors.toMap(o -> o.getKey(), Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

        System.out.println("map = " + map);




    }
}
