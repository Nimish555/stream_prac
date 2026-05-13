import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//	Given an ArrayList<String>: ["Java", "Code"], extract the last character of each string.
public class lastChar {
    static void main(String[] args) {
        List<String> list = Arrays.asList("java" , "code");
        List<Character> res = list.stream()
                .map(s-> s.charAt(s.length() - 1) )
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
