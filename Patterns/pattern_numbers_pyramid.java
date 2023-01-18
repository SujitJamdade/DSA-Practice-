package java_class;
import java.util.*;

public class pattern_numbers_pyramid {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i=1; i<=r; i++){
            for (int j=1; j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

/*

Output :

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

 */