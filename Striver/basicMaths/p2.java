// Count digits in a number
//Problem Statement: Given an integer N, return the number of digits in N.

package Striver.basicMaths;

public class p2 {
  public static void main(String[] args) {
    int n= 1234;

    int cnt = (int) (Math.log10(n) +1);

    System.out.println(cnt);
  }
}
