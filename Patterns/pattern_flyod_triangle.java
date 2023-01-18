package java_class;
import java.util.*;

public class pattern_flyod_triangle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int count = 0;
        for (int i=1; i<=r; i++){
            for(int j = 1; j<=i; j++){
                count+=1;
                System.out.print(count+"  ");
            }
            System.out.println();
        }

    }
}

/*
Output :

1
2  3
4  5  6
7  8  9  10

 */

