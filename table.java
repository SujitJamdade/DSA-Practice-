package java_class;
import java.util.*;

public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table number : ");
        int t = sc.nextInt();  // t = Table of number
        for (int i = 1; i<=10; i++){
            System.out.println(t+" * "+i+" = "+t*i);
        }
    }
}
