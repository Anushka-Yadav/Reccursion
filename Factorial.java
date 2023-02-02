import java.nio.IntBuffer;

public class Factorial {
    public static int Fact(int n) {

        if(n==1 || n==0){
            return 1;
        }
        int f = Fact(n-1);
        int fact = f*n;
        
        return fact;

        
    }

    public static void main(String[] args) {
        int g = Fact(5);
        System.out.println(g);
    }


}
