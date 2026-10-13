package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfeachElement {
    public static void frequencyOfEachElement(List<Integer> list){
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(ele -> ele,java.util.TreeMap::new, Collectors.counting()));
        collect.forEach((key,value)-> System.out.println("Element: "+key+" Count: "+value));
    }

    public static void main(String[] args) {
        List<Integer> listOfInteger=new ArrayList<>(Arrays.asList(3,2,6,6,1,4,3,4,1,6,4,5,6));
        frequencyOfEachElement(listOfInteger);
    }
}
