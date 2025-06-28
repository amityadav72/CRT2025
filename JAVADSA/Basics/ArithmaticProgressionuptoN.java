package CRT2025.JAVADSA.Basics;

import java.util.Scanner;

public class ArithmaticProgressionuptoN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the n terms :");
        int n = sc.nextInt();
        System.out.println(" Enter the first number");
        int a = sc.nextInt();
        System.out.println(" Enter the difference");
        int d= sc.nextInt();

        int an =0 ;



        for(int i = 1; i<=n; i++){

            an= a + (i - 1) * d;

            System.out.print(" "+ an);
        }


        // to print 4 7 10 13 .....

        System.out.println("Enter the number of terms");
        int n1 = sc.nextInt();
        System.out.println(" Enter the first number");
        int a1 =sc.nextInt();
        System.out.println(" Enter the difference");
        int d1 = sc.nextInt();

        int an1;

        for(int i = 1;i <=n1; i++ ){

            an1= a1 + (i - 1) * d1;
            System.out.println(an1+ " ");
        }

    }
}
