package java_class;
import java.util.*;

public class pattern_butter_fly {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        // Upper part

        for (int i = 1; i<=r; i++){

            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }

            int space = 2*(r-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        // lower part

        for (int i=r; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }

            int space = 2*(r-i);
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

/*
Input : 5

Output :


 *        *
 **      **
 ***    ***
 ****  ****
 **********
 **********
 ****  ****
 ***    ***
 **      **
 *        *


 */
