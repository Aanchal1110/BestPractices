import java.util.List;

public class printListOfStrings {
    public static void printListOfStrings(List<String> list){
        list.stream().forEach(System.out::println);
    }
    public static void main(String args[]){
        printListOfStrings(List.of("Aanchal","Pari", "Shweta"));
    }


}
