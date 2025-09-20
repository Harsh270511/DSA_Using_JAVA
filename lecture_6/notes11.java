package lecture_6;

public class notes11 {
  public static boolean isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void RangePrime(int n) {
    for (int i = 2; i < n; i++) {
      if (isPrime(i)) {
        System.out.print(i + "  ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    RangePrime(20);
  }
}
