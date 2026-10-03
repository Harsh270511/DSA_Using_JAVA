package ApnaCollege.L14_15Recursion;

public class notes13 {
  public static int friendsPairing(int n){
    //base case
    if(n ==1 || n ==2){
      return n;
    }
    //choices are single or pair
    //1) single ke liye
    int fnm1= friendsPairing(n-1);

    //2) pair ke liye
    int fnm2 = friendsPairing(n -2);
    int pairWays = (n-1) * fnm2;

    //total ways
    int totalWays= fnm1 + pairWays;

    return totalWays;

    //this is the direct way to ans/.. return friendsPairing(n-1) + (n -1) * friendsPairing(n -2);
  }
  public static void main(String[] args) {
    System.out.println(friendsPairing(4));
  }
  
}
