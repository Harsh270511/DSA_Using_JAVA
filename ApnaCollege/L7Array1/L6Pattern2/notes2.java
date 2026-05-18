//Invert and Rotated half-Pyramid
package ApnaCollege.L7Array1.L6Pattern2;


public class notes2 {
  public static void Invert_Half_Pyramid(int num) {
    // outer loop
    for (int i = 1; i <= num; i++) {

      // spaces printing
      for (int j = 1; j <= num - i; j++) {
        System.out.print(" ");
      }
      // star printing
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Invert_Half_Pyramid(5);
  }

}
