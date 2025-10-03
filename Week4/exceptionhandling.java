package Week4;
import java.util.*;
import java.io.*;
public class exceptionhandling{
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(new File("a.txt"));//checked exception:
        }
        catch(FileNotFoundException e){
            System.out.println("Exception handling "+e.getMessage());
        
        }
        System.out.println("Hello Pitambar, I can print our name, seeeee");
    }
}