/*
AimportNumber

Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

  */

import java.util.*;
import java.lang.*;
import java.io.*;

public class armstrong {
  public static void main(String[] args) throws java.lang.Exception {
    // your code here

    for (int i = 1; i <= 500; i++) {

      int j = i;
      int res = 0;

      while (j > 0) {
        int rem = j % 10;
        j = j / 10;
        res += (rem * rem * rem);

      }
      if (i == res) {
        System.out.println(i);
      }
    }
  }
}

/*
 * ~/DSA-Java$ javac armstrong.java
 * ~/DSA-Java$ java armstrong
 * 
 * Outp
 * 1
 * 153
 * 370
 * 371
 * 407
 * 
 * 
 */