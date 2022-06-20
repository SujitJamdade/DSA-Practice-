package java_class;

import java.sql.SQLOutput;
import java.util.*;
public class sum_of_n_natural_num {
    public static void main(String args[]){
        int sum_n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++){
            sum_n=sum_n+i;
        }
        System.out.println("Sum of n natural number is "+sum_n);
    }
}
