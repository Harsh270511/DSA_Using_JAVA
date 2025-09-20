package lecture_6;

import java.util.Scanner;

public class notes10 {
  public static int CountPrime(int n){
    int count=0;
    for(int i=2; i < n ; i++){
      if(n % i==0){
        count = i;
      }
    }return count;
  }
   
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();

    int ans = CountPrime(num);
    System.out.println(ans);
  }
}
