package Week3;

import java.util.Scanner;

public class nthtermofgp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, r, n, result;
        System.out.println("Enter the first term:");
        a = sc.nextInt();
        System.out.println("Enter the common ratio:");
        r = sc.nextInt();
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        // result=a*(r^(n-1));
       result=a* (int)Math.pow(r, n-1);
        System.out.println("The result is "+ result);
    }
}
