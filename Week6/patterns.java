package Week6;

import java.util.Scanner;

public class patterns {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows/Columns");
        int n=sc.nextInt();

        for(int row=0;row<n;row++){
        for(int column=0;column<n; column++){

System.out.print("*");
            }
            System.out.println();
        }
    }
}
