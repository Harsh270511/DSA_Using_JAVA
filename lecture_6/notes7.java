package lecture_6;

public class notes7 {
  // function to calculate the int sum
  public static int sum(int a, int b) {
    return a + b;
  }

  // function to calculate the fload sum
  public static float sum(float a, float b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println(sum(12, 45));
    System.out.println(sum(12.2f, 123.4f));
  }

}
