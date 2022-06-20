package java_class;
import java.util.*;

public class pattern_trangle_0_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i=1; i<=r; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
}
