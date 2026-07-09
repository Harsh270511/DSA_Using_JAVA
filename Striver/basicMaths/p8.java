//Prime number check
package Striver.basicMaths;

public class p8 {
  public static void prime(int n) {
    int cnt = 0;
    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        cnt++;

        if (i != n / i) {
          cnt++;
        }
      }
    }
    if (cnt == 2) {
      System.out.println("Prime Number");
    } else
      System.out.println("not a prime number");
  }

  public static void main(String[] args) {
    int n = 1;
    prime(n);

  }
}
