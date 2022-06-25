package java_class;
import java.util.*;

public class factorial {

    public static void factorial(int n){

        if (n<0){
            System.out.println("Invalid Number");

        }else {
            int product = 1;
            for (int i = n; i>=1; i--){
                product = product*i;
            }
            System.out.println("factorial of "+n+" is "+product);

        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);

    }
}
