import java.util.Scanner;
public class Print{
    public static void print(int n) {
        if(n==0){
            return;
        }
        else{
       System.out.println(n);
       print(n-1);
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}