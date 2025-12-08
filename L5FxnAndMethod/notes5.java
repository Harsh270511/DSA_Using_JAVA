
package L5FxnAndMethod;

import java.util.Scanner;

public class notes5 {
  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f *= i;
    }
    return f;
  }
  public static int binomialCoefficent(int n, int r){
    int n_fact= factorial(n);
    int r_fact= factorial(r);
    int nmr_fact= factorial(n - r);

    int Binomial= n_fact/(r_fact * nmr_fact);
    return Binomial;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number  n for factorial: ");
    int n = sc.nextInt();
    System.out.print("Enter your number  r for factorial: ");
    int r = sc.nextInt();

    int bio = binomialCoefficent(n, r);
    System.out.println(bio);
  }

}
