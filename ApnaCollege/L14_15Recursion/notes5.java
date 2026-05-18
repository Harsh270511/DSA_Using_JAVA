package ApnaCollege.L14_15Recursion;

public class notes5 {
  public static int fibo(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int f1 = fibo(n - 1);//f1 = fibonacci of n-1
    System.out.println(f1);
    int f2 = fibo(n - 2);//f2 = fibonacci of n-2
    System.out.println(f2);
    return f1 + f2;
  }

  public static void main(String[] args) {
    int num = 9;
    System.out.println(fibo(num));
  }

}
