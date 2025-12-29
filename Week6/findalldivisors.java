package Week6;

public class findalldivisors {
    public static void main(String[] args){
        //All divisors of the number
        int n=15;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+"  ");
            }
        }
    }
}
