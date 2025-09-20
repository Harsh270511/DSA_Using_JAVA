package lecture_10;

import java.util.Scanner;

public class notes1 {

  //this function is help to check the element at what index the same output or input code will be written just few changes occurs 
  public static boolean search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("the element is found at index (" + i + "," + j + ")");
          return true;
        }
      }

    }
    System.out.println("Key is not found.");
    return false;

  }

  public static void main(String[] args) {

    int[][] matrix = new int[3][3];
    int n = matrix.length, m = matrix[0].length;
    // outer loop for rows
    for (int i = 0; i < n; i++) {
      // inner loop for columns
      for (int j = 0; j < m; j++) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");
        matrix[i][j] = sc.nextInt();
      }
    }
    // output loop
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    search(matrix, 6);
  }

}
