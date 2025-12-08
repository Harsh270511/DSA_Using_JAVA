package L7Array1;

import java.util.Scanner;

public class notes5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns: ");
    int val = sc.nextInt();
    for (int i = 0; i < val; i++) {
      for (int j = 0; j < val; j++) {
        System.out.print(" * ");
      }
      System.out.println();

    }
  }

}
