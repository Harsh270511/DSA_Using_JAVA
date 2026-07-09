//Check if a number is palindrome or not

package Striver.basicMaths;
public class p4 {
  public static boolean palindrome(int n) {
    int rev = 0;
    int dup = n;

    while (n > 0) {
      int digits = n % 10;
      rev = rev * 10 + digits;

      n = n / 10;
    }
    return rev == dup;
  }

  public static void main(String[] args) {
    int x = 1231;

    System.out.println(palindrome(x));
  }
}
