package Week3;

import java.util.Scanner;

public class nthtermofap {
    public static void main(String[] args) {
        int a,d,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first term: ");
         a=sc.nextInt();
        System.out.println("Enter the common difference: ");
        d=sc.nextInt();
        System.out.println("Enter value of N to find the term");
        n=sc.nextInt();
        int result=a+(n-1)*d;
        System.out.println("The " +n + "th term  is"+ result);
        sc.close();
    }
}
