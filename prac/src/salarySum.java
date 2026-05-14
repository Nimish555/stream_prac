import java.util.Arrays;
import java.util.List;

//Write a Java program to find the total salary using reduce().
//ArrayList values (salary):
//[20000, 30000, 25000, 40000, 15000]
//2, 10,14,31,34,37,51,
public class salarySum {
    static void main(String[] args) {
        List<Integer> s = Arrays.asList(
                200,
                300,
                500
        );
        int sal = s.stream()
                .reduce(0 , (a,b) -> a+ b);

        System.out.println(sal);
    }
}
