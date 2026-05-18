//Search in sorted matrix 
//this is the optimise way to solve the problem the top right will  be taken as reference
package ApnaCollege.L10Two_D_Array;

public class notes5 {
  public static boolean SearchMat(int matrix[][], int key){
    int row=0;
    int col= matrix[0].length- 1;
    while(row <matrix.length && col >=0){
      if(matrix[row][col] == key){
        System.out.println("Key is found at index ("+ row + ","+ col + ")");
        return true;
      }else if(key < matrix[row][col]){
        col--;
      }else if(key > matrix[row][col]){
        row++;
      }
    }
    System.out.println("key is not found ");
    return false;
  }
  public static void main(String[] args) {
    int matrix[][]= {{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};
    SearchMat(matrix, 16);
  }
  
}
