//Armstrong num
import java.util.*;

public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while (n > 0){
            int rem = n % 10;
            res = res + (rem * rem * rem);
            n = n / 10;
        }
        if(res == n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}

