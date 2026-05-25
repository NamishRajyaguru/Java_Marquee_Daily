// Right angle Triangle Pattern 1
public class RightAngleTriangle {
    public static void main(String[] args) {

        // Write your code here
        int s = 5;
        for(int i = 0; i <= s; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}

