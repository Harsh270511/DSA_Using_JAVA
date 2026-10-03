//sum  of n positive natural numbers
package ApnaCollege.L14_15Recursion;

public class notes4 {
  public static int sum(int n) {
    // edge case
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;

    }
    // int Snm1 = sum(n - 1);//Snm1 = sum of n-1
    // int Sn = n + Snm1; //Sn= sum of n or we can directly return n + sum(n -1) or choose the just above two lines
    return n + sum(n - 1);
  }

  public static void main(String[] args) {
    int num = 10;
    System.out.println(sum(num));
  }

}
