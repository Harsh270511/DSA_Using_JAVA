//calculating the factorial of number
package L7Array1;

import java.util.Scanner;

public class notes10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    long num = sc.nextLong();
    long fact = 1;
    for (long i = 1; i <= num; i++) {
      fact = fact * i;
    }
    System.out.println(fact);
  }

}
