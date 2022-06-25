package java_class;
import java.util.*;
public class table_function {

    public static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Table : ");
        int n = sc.nextInt();

        table(n);
    }
}
