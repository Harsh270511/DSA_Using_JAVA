//butterFly pattern
package ApnaCollege.L6Pattern2;


public class notes6 {
  public static void butterFly(int n){

    //1st help outer loop
    for(int i=1; i<= n; i++){
      //stars = i
      for(int j=1; j <= i;j++){
        System.out.print("*");
      }
      //spaces = 2*(n -i)
      for(int j=1; j <= 2*(n -i) ; j++){
        System.out.print(" ");
      }

      //stars = i
      for(int j=1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }


    //2nd half outer loop
    for(int i = n; i >= 1; i--){
      //stars = i
      for(int j=1; j <= i;j++){
        System.out.print("*");
      }
      //spaces = 2*(n -i)
      for(int j=1; j <= 2*(n -i) ; j++){
        System.out.print(" ");
      }

      //stars = i
      for(int j=1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    butterFly(4);
  }
}
