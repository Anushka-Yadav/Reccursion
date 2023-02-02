public class SumN {
    public static void Sum(int i,int sum,int n){
        
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        Sum(i+1,sum,n);
        
    }
    public static void main(String[] args) {
        
        Sum(5,0,5);
    }
}
