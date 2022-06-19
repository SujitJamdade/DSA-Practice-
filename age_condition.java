package java_class;

import java.util.*;
public class age_condition {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You can vote");
        }else{
            System.out.println("You are not eligible for vote");
        }

    }
}
