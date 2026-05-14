import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//5.	Given an ArrayList<String>: ["A", "B", "C"], add prefix "Item-" to each element.
public class prefixx {
    static void main(String[] args) {
        List<String> list = Arrays.asList("A" , "B " , "C");
        List<String> ans = list.stream()
                .map(s-> "Item-" + s)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
