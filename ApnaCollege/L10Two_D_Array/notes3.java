//Sum of Diagonal matrix
package ApnaCollege.L10Two_D_Array;

public class notes3 {
  public static int diagonal(int matrix[][]) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (i == j) {
          sum+= matrix[i][j];
        }else if(i+j==matrix.length-1){
          sum += matrix[i][j];
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 } };
    // diagonal(matrix);
    System.out.println(diagonal(matrix));

  }
}
