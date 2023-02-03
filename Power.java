// stack height is n
// or we can say the TimeComplexity is O(n)

public class Power {
    public static int power(int x,int n) {
       if(x==0){
        return 0;
       }
       if(x==1 || n==0){
        return 1;
       }
       int g = power(x, n-1);
       int pow = x * g;
       return pow;
    
    }
    public static void main(String[] args) {
        int k = power(5, 2);
        System.out.println(k);
    }
}
