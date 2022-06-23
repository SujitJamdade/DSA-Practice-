package java_class;
import java.util.*;

public class pattern_solid_rhombus {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();

        for (int i=1; i<=r; i++){
            int space = r-i;
            for (int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            System.out.print("*****");
            System.out.println();
        }

    }
}

/*
Output :

    *****
   *****
  *****
 *****
*****

 */
