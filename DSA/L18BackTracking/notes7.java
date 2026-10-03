//Grid problem
package ApnaCollege.L18BackTracking;

public class notes7 {
  public static int gridWays(int i, int j , int n, int m){
    //base case
    if(i == n-1 && j==m-1){//condition checking
      return 1;
    }else if(i ==n || j==m){//boundary checking 
      return 0;
    }

    //recursive function
    int ways1= gridWays(i+1, j, n, m);
    int ways2= gridWays(i, j+1, n, m);
    return ways1 + ways2;
  }

  public static void main(String[] args) {
    int n=3,m=3;
    System.out.println("the number of ways are: "+gridWays(0,0,n,m));
  }
  
}
