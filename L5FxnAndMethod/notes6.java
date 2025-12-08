package L5FxnAndMethod;


public class notes6 {
  // function to calculate sum of 2 numbers
  public static int sum(int a, int b) {
    return a + b;
    
  }
  // function to calculate sum of 3 numbers

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    int twoSum= sum(2, 4);
    System.out.println(twoSum);
    int threeSum= sum(1, 5, 7);
    System.out.println(threeSum);

  }
}
