package Week7;

import java.util.*;

public class inverted_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // For space:
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // For star:
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}