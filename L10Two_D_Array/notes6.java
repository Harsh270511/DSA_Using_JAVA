//Search in sorted matrix 
//this is the optimise way to solve the problem the bottom right will  be taken as reference
package L10Two_D_Array;

public class notes6 {
  public static boolean StairCase(int matrix[][], int key) {
    int i = matrix.length - 1, j = 0;
    while (i >= 0 && j < matrix[0].length) {
      if (matrix[i][j] == key) {
        System.out.println("Key is found at index: " + i + " ," + j);
        return true;
      } else if (key < matrix[i][j]) {
        i--;
      } else if (key > matrix[i][j]) {
        j++;
      }
    }
    System.out.println("key is not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    StairCase(matrix, 16);
  }
}
