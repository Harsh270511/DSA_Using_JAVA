//way 1 for binary to decimal
package ApnaCollege.L5FxnAndMethod;


public class notes13 {
  public static void DecimalToBinary(int n) {
    String binary = " ";
    // int number = 0;
    while (n > 0) {
      int digit = n % 2;
      binary =digit + binary;
      n /= 2;
    }
    System.out.println(binary);
  }

  public static void main(String[] args) {
    DecimalToBinary(7);
  }

}
