package java_class;
import java.util.*;

public class find_index_position {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int number [][] = new int[r][c];

        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                number[i][j]= sc.nextInt();
            }
        }
        int x = sc.nextInt(); // index position of given number
        for (int i=0; i<r; i++) {
            for (int j =0; j<c; j++) {
                if (number[i][j]==x){
                    System.out.println("Number present at row no "+i+" and column no "+j+" location is "+i+","+j);
                }

            }
        }

    }
}
