import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//11.	Given an ArrayList<Double>: [0.0, 20.0, 30.0], convert Celsius values to Fahrenheit.
public class celsiusTofarhen {
    static void main(String[] args) {
        List<Double> list = Arrays.asList(0.0 , 20.0 , 30.0);
        List<Double> res = list.stream()
                .map(s-> (s * 9/5) + 32)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
