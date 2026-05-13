import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//	Given an ArrayList<String>: ["1", "2", "3"], convert all elements into integers.
public class toInteger {
    static void main(String[] args) {
        List<String> list = Arrays.asList("1" ,"2" , "3" );
        List<Integer> ans = list.stream()
                .map(s-> Integer.parseInt(s))
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
