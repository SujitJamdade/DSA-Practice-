package java_class;

import java.util.*;
public class else_if {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if (button==1){
            System.out.println("Hello");
        }else if (button==2){
            System.out.println("Namste");
        }else if (button==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("Please press button only from 1 to 3");
        }
    }
}

