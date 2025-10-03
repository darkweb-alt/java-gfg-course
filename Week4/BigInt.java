package Week4;

import java.math.BigInteger;

public class BigInt {
    public static void  main(String[] arhs){
BigInteger a=new BigInteger("55");
BigInteger b=new BigInteger("100");
System.out.println("The addition of two big integers is "+ a.add(b));

try{
BigInteger name=new BigInteger("Pitambar");

}
catch(NumberFormatException e){
    System.out.println(e.getMessage());
}
// System.out.println(valueOf(name));
// String names=name.toString();
finally{

// System.out.println(name);
System.out.println("What the hell is going");
}
int A=a.intValue();
int B=b.intValue();
System.out.println("The addition is "+ a.add(b));

    }
}
