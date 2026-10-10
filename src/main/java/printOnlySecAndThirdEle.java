import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printOnlySecAndThirdEle {
    public static void printSecAndThird(List<Integer> list){
        System.out.println(list.stream().skip(1).limit(2).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(22,43,21,53,21,90));
        printSecAndThird(list);
    }
}
