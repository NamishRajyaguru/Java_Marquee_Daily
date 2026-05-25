// perfect square
public class Test8{
    public static void main(String[] args){
        int i = 5;
        while (true){
            int square = i * i;
            i++;
            if(square > 80){
                break;
            }
            System.out.println(square);
        }    
    }
}
