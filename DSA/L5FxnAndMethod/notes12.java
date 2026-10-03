package ApnaCollege.L5FxnAndMethod;

public class notes12 {

  public static void binaryToDecimal(int num) {
    int myNum = num;
    int power = 0;
    int decimal = 0;

    while (num > 0) {
      int lastDigit = num % 10;
      decimal = decimal + (lastDigit * (int) Math.pow(2, power));
      power++;
      num = num / 10;

    }
    System.out.println("Decimal of " + myNum + " = " + decimal);
  }

  public static void main(String[] args) {
    int n = 10100011;
    binaryToDecimal(n);

  }

}
