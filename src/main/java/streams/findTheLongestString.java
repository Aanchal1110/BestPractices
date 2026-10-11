package streams;

import java.util.*;
import java.util.stream.Collectors;

public class findTheLongestString {
    //find the longest string in the given list
    public static void finding(List<String> list){
        Optional<String> max = list.stream().max(Comparator.comparing(String::length));
        System.out.println("Maximum string is: "+ max.get());
    }

    public static void main(String[] args) {
        List<String> elements=new ArrayList<>(Arrays.asList("Aanchal","Lalalala", "turturtur"));
        finding(elements);
    }
}
