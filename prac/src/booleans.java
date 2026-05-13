import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//15.	Given an ArrayList<Integer>: [1, 2, 3, 4], convert into a list of booleans indicating even numbers
 public class booleans{
     static void main(String[] args) {
         List<Integer> list = Arrays.asList(1 , 2 , 3  , 4);
         List<Boolean> res = list.stream()
                 .map(n -> n % 2 == 0)
                 .collect(Collectors.toList());
         System.out.println(res);

     }

 }