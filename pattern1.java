package java_class;

import java.util.*;
public class pattern1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // Enter how many rows you want
        int c = sc.nextInt(); // ENter how many column you want

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*
Output :

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */