import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersAndSquares {
    public static void main(String args[]){
        List<Integer> list=new ArrayList<>(Arrays.asList(12,534,23,52,51,43,12,32));
        list.stream().filter(n->n%2!=0).map(n->n*n).forEach(n-> System.out.println("odd num -> "+n));
    }
}
