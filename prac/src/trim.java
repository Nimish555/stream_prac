//10.	Given an ArrayList<String>: [" Java ", " Python ", " C++ "], trim all strings.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class trim {
    static void main(String[] args) {
        List<String> list = Arrays.asList("java  " , "   python" , "cpp");
        List<String> ans = list.stream()
                .map(s->s.trim())
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
