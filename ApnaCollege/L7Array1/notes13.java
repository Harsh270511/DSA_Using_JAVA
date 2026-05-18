package ApnaCollege.L7Array1;

import java.util.*;

public class notes13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // input of the 2-D matrix
    System.out.print("Enter the number of rows: ");
    int row = sc.nextInt();
    System.out.print("Enter the number of col: ");
    int col = sc.nextInt();

    int[][] matrix = new int[row][col];
    // input of values in matrix
    System.out.print("Enter the values of the matrix: ");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    // counting of non-zero elements
    int NonZero = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (matrix[i][j] != 0) {
          NonZero++;
        }
      }

    }
    // spare matrix (row, col, value)
    int sparse[][] = new int[NonZero+1][3];
    sparse[0][0] = row;
    sparse[0][1] = col;
    sparse[0][2] = NonZero;

    int k = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (matrix[i][j] != 0) {
          sparse[k][0] = i;
          sparse[k][1] = j;
          sparse[k][2] = matrix[i][j];
          k++;
        }
      }
    }
    // print the sparse matrix
    System.out.print("In sparse matrix(row, col, value: )");
    for (int i = 0; i <= NonZero; i++) {
      System.out.println(sparse[i][0] + " " + sparse[i][1] + " " + sparse[i][2]);
    }
  }

}
