package lecture_6;

import java.util.Scanner;

public class notes8 {
  // true mtlb prime number
  // false mtlb not prime number 
  public static String isPrime(int n) {

    //corner case as if n =2 then the below loop will not execute so that program will run more faster
    if(n==2){
      return "Prime number";
    }

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return "Not prime";

      }
    }
    return "Prime number";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to check: ");
    int num = sc.nextInt();
    System.out.println(isPrime(num));
  }
}