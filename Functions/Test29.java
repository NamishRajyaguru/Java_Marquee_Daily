// Function to check if character is vowel or not

import java.util.Scanner;

public class Test29{
    
    static boolean vowel(char c){
        char[] array = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(char vow : array){
            if (vow == c){
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(vowel(c));
    }
}
