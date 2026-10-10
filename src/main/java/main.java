import java.util.List;
import java.util.stream.Collectors;

public class main {


    public static void printOnlyOdd(List<Integer> list){
         list.stream().filter(n ->n%2!=0).forEach(n->System.out.println(STR."this is an odd number ->\{n}"));
    }

    public static void main(String arg[]){
        printOnlyOdd(List.of(12,34,56,76,33,219899,31));
    }
}
