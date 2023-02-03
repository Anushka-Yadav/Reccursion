public class OptPower {
    
        public static int power(int x,int n) {
           if(x==0){
            return 0;
           }
           if(x==1 || n==0){
            return 1;
           }
           if(n%2==0){
            int g = power(x,n/2);
            int pow = g*g;
            return pow;
           }
           else{
            int g = power(x,n/2);
            int pow = g * g * x;
            return pow;
           }
           
        
        }
        public static void main(String[] args) {
            int k = power(5, 2);
            System.out.println(k);
        }
    }

