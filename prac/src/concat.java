import java.util.Arrays;
import java.util.List;

public class concat {
    static void main(String[] args) {
        List<String> list = Arrays.asList(
                "ravi",
                "rahul",
                "java",
                "stream"
        );
        String s = list.stream()
                .map(String::toUpperCase)
                .reduce("" , (a,b)-> a + b);
        System.out.println(s);
    }
}
