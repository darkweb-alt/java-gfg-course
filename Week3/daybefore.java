package Week3;

import java.util.Scanner;

public class daybefore{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String[] days={"Sunday","Monday","Tuesday","Wednesday",
"Thursday","Friday","Saturday"};

System.out.println("Enter current day");
int c=sc.nextInt();
System.out.println("Enter day before to find");
int b=sc.nextInt();
int before=b%7;
if(c-before>0){
System.out.println(days[c-before]);

}
else{
    System.out.println(days[c-before+7]);
}

    }
}