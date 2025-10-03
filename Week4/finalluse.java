package Week4;
// import java.io.*;
public class finalluse {
    public static void main(String[] args){
        try{
        int result=10/0;

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
        finally{
            System.out.println("Whatever happened in try and catch block , IDCCC");
        }
    // System.out.println(div(5, 0));
    // System

    }
    static int div(int a, int b) throws ArithmeticException{
return a/b;
    }
}
