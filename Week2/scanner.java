import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        // System.out.println("Welcome Mr "+ name);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("Enter your CGPA: ");
        int cgpa=sc.nextInt();
        System.out.println("Name= " + name + " Age= " + age + " CGPA= "+ cgpa);
        sc.close();
        

    }
}
