import java.util.stream.IntStream;

public class factorial {
    static void main(String[] args) {
        int ans = IntStream.rangeClosed(1,5)
                .reduce(1 , (a,b)-> a*b);
        System.out.println(ans);
    }
}
