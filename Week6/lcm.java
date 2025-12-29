package Week6;

public class lcm {
    public static void main(String[] args) {
        //LCM of two numbers is such number which device them both
        int a=15;
        int b=11;
        int ans=1;
        int c=Math.max(a,b);
        int y=a*b;

        // int i=c;
for(int i=c; i<=y;i++){
    if( i% a==0 && i%b==0){
        ans=i;
        break;
    }
}
        System.out.println(ans);
    }
}
