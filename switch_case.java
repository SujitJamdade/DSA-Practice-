package java_class;

import java.util.Scanner;

public class switch_case {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button){

            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Namste");
            break;

            case 3 :System.out.println("Bonjour");
            break;

            default: System.out.println("Please press button only from 1 to 3");
        }
    }
}
