package java_class;
import java.util.*;
public class pattern_diamond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        // Upper half
        for (int i=1; i<=r; i++){
            for (int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            int star = (2*i) -1;
            for (int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half

        for (int i=r; i>=1; i--){
            for (int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            int star = (2*i) -1;
            for (int j=1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

Output :

   *
  ***
 *****
*******
*******
 *****
  ***
   *

 */