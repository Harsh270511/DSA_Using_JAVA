//Inverted half- Pyramid wiht numbers
package ApnaCollege.L6Pattern2;


public class notes3 {
  public static void Half_Pyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j+ " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Half_Pyramid(15);
  }
}
