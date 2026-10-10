import java.util.List;

public class printWordsWithSpecificNumberOfLetters {

    public static void printWordsWithLetter(List<String> list){
        list.stream().filter(n ->n.length()>=4).forEach(n-> System.out.println(n));
    }

    public static void main(String args[]){
         printWordsWithLetter(List.of("Tomatoes", "bat","ate", "late", "yummies", "ratatata", "supper"));
    }
}
