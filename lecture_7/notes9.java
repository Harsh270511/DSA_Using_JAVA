//Diamond pattern
package lecture_7;

public class notes9 {
  public static void DiamondPattern(int n) {
    // 1st half outer loop
    for (int i = 1; i <= n; i++) {
      // spaces= (n-i)
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // stars= (2*i) - 1
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // 2nd half outer loop
    for (int i = n; i >= 1; i--) {
      // spaces= (n-i)
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      // stars= (2*i) - 1
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    DiamondPattern(4);
  }
}
