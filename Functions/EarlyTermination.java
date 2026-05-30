// Early Function Termination

import java.util.Scanner;

public class EarlyTermination{

    public static void add(int a, int b){
        if (a == 2){
            return;
        }
        System.out.println(a + b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a, b);
        sc.close();
    }
}