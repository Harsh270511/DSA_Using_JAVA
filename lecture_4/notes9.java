package lecture_4;

import java.util.*;

public class notes9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);// object
    System.out.print("Enter the number to check for prime or not: ");
    int num = sc.nextInt();

    boolean isPrime = false;
    for (int i = 2; i < Math.sqrt(num); i++) {
      // System.out.println(i); just checking how the loop is running
      if (num == 2) {
        System.out.print(num + " Prime number");

      }
      if (num % i == 0) {
        isPrime = true;
        break;
      }

    }
    if (isPrime == false) {
      System.out.println(num + " is prime number");
    } else {
      System.out.println(num + " is Not prime");
    }

  }

}
