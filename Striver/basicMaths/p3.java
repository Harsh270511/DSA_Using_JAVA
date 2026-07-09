//Reverse a number
package Striver.basicMaths;

public class p3 {
  public static void main(String[] args) {
    int num = 12345;

    int rev = 0;

    while (num > 0) {
      int digits = num % 10;
      rev = (rev * 10) + digits;

      num = num / 10;
    }
    System.out.println(rev);
  }
}