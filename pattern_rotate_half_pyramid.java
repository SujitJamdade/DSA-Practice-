package java_class;
import java.util.*;

public class pattern_rotate_half_pyramid {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i=1; i<=r; i++){
            for (int blank=1; blank<=(r-i); blank++){
                System.out.print(" ");
            }
            for (int star=1; star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Output :

    *
   **
  ***
 ****
*****

 */