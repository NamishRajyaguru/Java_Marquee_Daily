// Max distance between two duplicate elements

import java.util.Scanner;

public class DistanceBetweenTwoDuplicates{

    public static int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }

    public static int findDistance(int[] arr, int n){
        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i != j && arr[i] == arr[j]){
                    if(res == 0){
                        res = j - i;
                    }
                    res = max(res, j - i);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDistance(arr, n));
        sc.close();
    }
}