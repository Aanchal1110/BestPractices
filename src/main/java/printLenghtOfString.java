import java.util.List;

public class printLenghtOfString {
    public static void printLength(List<String> list){
        list.stream().forEach(n-> System.out.println(n.length()));
    }

    public static void printLengthMap(List<String> list){
        list.stream().map(n->n.length()).forEach(System.out::println);
    }

    public static void main(String args[]){
        printLength(List.of("A", "Fox", "can ", "have jumped", "higher"));
    }
}
