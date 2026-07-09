//check if the number is armstrong or not
package Striver.basicMaths;

public class p5 {
  public static boolean armstrong(int n) {
    int val = (int) (Math.log10(n) + 1);
    int dup = n;
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum = sum + (int) Math.pow(digit, val);
      n = n / 10;
    }
    return sum == dup;
  }

  public static void main(String[] args) {
    int x = 371;
    System.out.println(armstrong(x));
  }
}
