package Week2;

import java.io.IOException;
import java.io.*;

public class practise {
    public static void main(String args[]) throws IOException{
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Name");
String name=bf.readLine();
int number=Integer.parseInt(bf.readLine());
System.out.println("You entered number-"+ number);
System.out.println("Your name is "+ name);





    }
}
