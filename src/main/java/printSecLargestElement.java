import java.util.*;


public class printSecLargestElement {
 ///get the second largest element

    public static void printSecondLargestElement(List<Integer> ele){

        Optional<Integer> result=ele.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        if(!result.isEmpty()){
            System.out.println(result.get());
        }
        else {

        }
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(5));
        printSecondLargestElement(list);

    }
}
