import java.util.List;

public class printSquareOfNumbers {
    public static void printSquares(List<Integer> list){
        list.stream().map(n->n*n).forEach(n-> System.out.println(n));
    }

    public static void main(String args[]){
        printSquares(List.of(23,21,23,45,32));
    }
}
