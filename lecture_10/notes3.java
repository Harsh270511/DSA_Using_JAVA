//Sum of Diagonal matrix
package lecture_10;

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
    int[][] matrix = { { 1, 2, 3}, { 5, 6, 7 }, { 9, 10, 11 } };
    // diagonal(matrix);
    System.out.println(diagonal(matrix));

  }
}
