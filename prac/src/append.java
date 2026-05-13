import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given an ArrayList<String>: ["Java", "API"], append the length of each string (e.g., "Java-4").
public class append {
    static void main(String[] args) {
        List<String> list = Arrays.asList("java" , "api" );
        List<String> res =  list.stream()
                .map(s-> s  + "-" + s.length())
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
