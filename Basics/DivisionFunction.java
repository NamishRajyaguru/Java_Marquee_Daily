public class DivisionFunction{
    public static void main(String[] args){
        System.out.println(div(345000, 50));
    }

    public static float div(float a, float b){
        if(b == 0){
            return -1;
        }
        return a / b;
    }
}

