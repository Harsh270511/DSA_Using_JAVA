package lecture_5;

import java.util.Scanner;

public class notes3 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Half Pyramid number: ");
    int num= sc.nextInt();

    for(int i=1; i <= num; i++){
      for(int j=1; j <= i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
  
}
