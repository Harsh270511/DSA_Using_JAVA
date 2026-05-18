
//Solid Rhombus
package ApnaCollege.L7Array1.L6Pattern2;


public class notes7 {
  public static void SolidRhmbs(int n){
    //outer loop

    for(int i=1; i <= n; i++){

      //space = n-i
      for(int j=1; j <= n- i; j++){
        System.out.print(" ");
      }

      //stars= n
      for(int j=1; j <= n ; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    SolidRhmbs(5);
  }
}
