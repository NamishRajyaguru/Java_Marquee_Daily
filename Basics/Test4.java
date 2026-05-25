import java.util.*;
public class Test4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i = start;
        while (true) { 
            if(i * i <= end && i * i >= start){
                System.out.println(i * i);
            }
            if (i * i > end){
                break;
            }
        }
    }
}
