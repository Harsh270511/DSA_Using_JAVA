// Print Hollow Rectangle Pattern

package L6Pattern2;
public class notes1 {
  public static void Hollow_pattern(int totRows, int tolCols) {
    // outer loop
    for (int i = 1; i <= totRows; i++) {

      // inner-loop
      //cell is(i , j);
      for (int j = 1; j <= tolCols; j++) {
        if (i == 1 || i == totRows || j == 1 || j == tolCols) {
          System.out.print(" *");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    Hollow_pattern(14, 10);
  }

}
