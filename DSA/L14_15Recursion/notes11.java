package ApnaCollege.L14_15Recursion;
public class notes11 {
  public static int tilingProblem(int n){// n for length of the floor/board
    //base case
    if(n ==0 || n ==1){
      return 1;
    }
    //kaam = vertical and horizontal

    //verticle
    int fnm1= tilingProblem(n-1);

    //horizonal
    int fnm2= tilingProblem(n -2);
    //calling inner fxn
    int total= fnm1 + fnm2;
    return total;
  }
  public static void main(String[] args) {
    int n=3;
    System.out.println(tilingProblem(n));
  }
}
