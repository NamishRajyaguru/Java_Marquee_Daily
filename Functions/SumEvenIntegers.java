// Return Sum of Even Integers from given Start to End range

import java.util.Scanner;

public class SumEvenIntegers{

    public static int sumEven(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int res = sumEven(start, end);
        System.out.println(res);
    }
}