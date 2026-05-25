// Fibonacci series
import java.util.*;

public class Test7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(sum);
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}