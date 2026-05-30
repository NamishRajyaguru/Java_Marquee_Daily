// Subtraction of individual elements of two arrays

import java.util.Arrays;
import java.util.Scanner;

public class SubtractionOfIndividualElementsOfTwoArray{

    public static int[] subtract(int[] a, int[] b, int n){
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = a[i] - b[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(subtract(a, b, n)));
        sc.close();
    }
}