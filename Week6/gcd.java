package Week6;
import java.util.*;
public class gcd {
    public static void main(String[] args) throws ArithmeticException{
        int a=24;
        int b=18;
        int c=Math.min(a,b);
        int ans=1;
     

        
        for(int i=1;i<=c;i++){
            if( a%i==0 && b%i==0){
                ans=i;
            }
        }
  
        System.out.println("The GCD of 24 and 18 is "+ ans);

    }
}
