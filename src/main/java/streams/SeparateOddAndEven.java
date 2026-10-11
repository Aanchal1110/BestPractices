package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
    public static void separateOddAndEvenFromAList(List<Integer> list) {
        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Even numbers: " + result.get(true));
        System.out.println("Odd numbers: " + result.get(false));
    }


    public static void main(String args[]) {

        List<Integer> elements=new ArrayList<>(Arrays.asList(23,34,22,21,45,56,89));
        separateOddAndEvenFromAList(elements);

    }
}