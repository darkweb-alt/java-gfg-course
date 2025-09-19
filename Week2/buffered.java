package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class buffered{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PLease enter your name.");
       String name= br.readLine();
       System.out.println("You entered "+ name);
        



    }
}