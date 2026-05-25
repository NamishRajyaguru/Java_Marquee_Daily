//Sum of square of digits
import java.util.*;
public class Test00{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while (n > 0){
            int rem = n % 10;
            res = res + (rem * rem);
            n = n / 10;
        }
        System.out.println(res);
    }
}

