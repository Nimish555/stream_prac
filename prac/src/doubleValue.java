import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//	Given an ArrayList<Integer>: [5, 10, 15], double each value.
public class doubleValue {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(5 , 42 , 3);
        List<Integer> ans = list.stream()
                .map(n-> 2*n)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
