import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class printUniqueAndInDescOrder {
    public static List<Integer> printUniqueAndInDesc(List<Integer> list){
        List<Integer> result=new ArrayList<>();
        result=list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
     List<Integer> list1=   printUniqueAndInDesc(List.of(66,12,46,21,67,32,11));
        System.out.println(list1);
    }

}
