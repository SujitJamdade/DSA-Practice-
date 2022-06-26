package java_class;
import java.util.*;

public class odd_even_function {

    public static void odd_even_check(int n){
        if (n%2==0){
            System.out.println(n+" is a even number");
        }else{
            System.out.println(n+" is a odd number");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        odd_even_check(n);

    }
}
