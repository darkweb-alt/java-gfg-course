package Week3;

import java.util.Scanner;

public class bitwise {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        // System.out.println("HEllo pitambar");
        System.out.println("We are doing one thing:");
        System.out.println("Finding the negation of some integer value");
        System.out.println("Enter the number");
        number=sc.nextInt();
        System.out.println("The negation of the number is "+ ~number);
        //Negation is nothing but just the interchaning of bits , 1 to 0 and 0 to 1
        // example:
        // 5=0000000000000....101
        // -5= (Since negative number is stored in 2's complemenet , the value will be 2^32 -5)
        // i.e 11111111.....010;
        sc.close();


    }
}
