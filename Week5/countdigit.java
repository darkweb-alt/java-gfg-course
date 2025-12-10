package Week5;

import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        int number=12345;
        int count=0;
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter number to check the number of digits: ");
        a=sc.nextInt();

        while(a>0){
            a=a/10;
            count=count+1;
        }
        System.out.println("The number of terms are: "+count);
    }
}
