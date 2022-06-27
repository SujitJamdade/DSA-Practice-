package java_class;
import com.sun.source.tree.CompilationUnitTree;

import java.util.*;

public class array_2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int number [][] = new int[row][col];

        for (int i=0; i<row; i++){
            for (int j =0; j<col; j++){
                number[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<row; i++){

            for (int j =0; j<col; j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
