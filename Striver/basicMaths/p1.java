// Count digits in a number
//Problem Statement: Given an integer N, return the number of digits in N.
package Striver.basicMaths;

public class p1 {
  public static void main(String[] args) {
    int n=12113;
    int cnt=0;
    while(n >0){
      
      cnt++;
      n =n/10;
    }

    System.out.println(cnt);
  }
}
