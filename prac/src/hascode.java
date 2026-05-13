import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//13.	Given an ArrayList<String>: ["Java", "Python"], convert each string into its hash code
public class hascode {
    static void main(String[] args) {
        List<String> list = Arrays.asList("java" , "python");
        List<Integer> res = list.stream()
                .map(s-> s.hashCode())
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
