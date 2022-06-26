package java_class;
import java.util.*;

public class prime_number_function {

    public static void prime_number(int n){
         if (n<1){
             System.out.println("Invalid Number");
         } else if (n==1){
            System.out.println("1 is not prime number and composite numbers");
        }else{
            int count = 0;
            for (int i=2; i<=(n/2); i++){
                if (n%i == 0){
                    count = count+1;
                }
            }

            if (count==0){
                System.out.println(n+" is prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        prime_number(n);

    }
}
