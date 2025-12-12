package Week6;
import java.util.Scanner;
public class triangular {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows you want: ");
    int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int i=1;
        while(i<4){
            i++;
            int j=1;
            while(j<i){
                System.out.print("*");
                j++;

            }
            System.out.println();
        }
    }
}
