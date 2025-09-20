//Printing the reverse symbols
package lecture_5;

import java.util.Scanner;

public class notes2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num= sc.nextInt();

    for(int i=0; i < num; i++){
      //we use j=0 ; j <= num - i + 1 the below condition is also right
      for(int j=i; j < num; j++){
        System.out.print(" * ");
      }
      System.out.println();
    }
  }
  
}
