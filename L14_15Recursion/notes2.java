//printing the number in increasing order using recursion

package L14_15Recursion;

public class notes2 {
  public static void printInc(int n) {
    if (n == 1) {
      System.out.print(n + " ");
      return;
    }
    printInc(n - 1);
    System.out.print(n + " ");

  }

  public static void main(String[] args) {
    int n = 10;
    printInc(n);
  }

}
