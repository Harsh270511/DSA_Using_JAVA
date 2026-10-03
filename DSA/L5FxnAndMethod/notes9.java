//optimize way to solve the problem

package ApnaCollege.L5FxnAndMethod;

import java.util.Scanner;

public class notes9 {
  public static String isPrime(int n) {
    if(n ==2){
      return "Prime number";
    }

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return "Not prime";
      }
    }
    return "Prime number";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number:  ");
    int n = sc.nextInt();

    String ans = isPrime(n);
    System.out.println(ans);
  }
}
