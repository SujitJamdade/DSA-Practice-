package java_class;
import java.util.*;
public class pattern_palindrom {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();

            for (int i=1; i<=r; i++){
                for (int j=1; j<=r-i; j++){
                    System.out.print(" ");
                }
                for (int j=1;j<=i;j++){
                    System.out.print(i);
                }
                for (int j=2;j<=i;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
    }
}

/*
Output :

    1
   222
  33333
 4444444
555555555

 */
