//Search in sorted matrix;
//this is the brute force approach to solve this problem
package ApnaCollege.L10Two_D_Array;

public class notes4 {
  public static boolean checkSearch(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("Key is found at index: " + i + " " + j);
          return true;
        }
      }

    }
    System.out.println("key is not found");
    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 15, 6 }, { 7, 8, 9 } };
    checkSearch(matrix, 82);
  }
}
