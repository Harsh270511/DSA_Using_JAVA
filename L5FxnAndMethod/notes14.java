//way 2 for binary to decimal;
package L5FxnAndMethod;


public class notes14 {
  public static void DecimalToBinary(int n) {
    int myNum = n;
    int power = 0;
    int binNum = 0;

    while (n > 0) {
      int rem = n % 2;
      binNum = binNum + (rem * (int) Math.pow(10, power));

      power++;
      n = n / 2;
    }
    System.out.println("Decimal number to " + myNum + "= " + binNum);

  }

  public static void main(String[] args) {
    DecimalToBinary(11);
  }

}
