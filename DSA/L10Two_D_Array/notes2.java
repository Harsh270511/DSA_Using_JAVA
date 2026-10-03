//Spiral Matrix

package ApnaCollege.L10Two_D_Array;

public class notes2 {
  public static void Spiral(int matrix[][]){
    int StartRow= 0;
    int EndRow =matrix.length - 1;
    int StartColumn = 0;
    int EndColumn = matrix[0].length -1;

    while(StartRow <= EndRow && StartColumn <= EndColumn){
      //top part j for column
      for(int j=StartColumn; j <= EndColumn; j++){
        System.out.print (matrix[StartRow][j]+ " ");
      }
      
      //right part i for row
      for(int i= StartRow + 1; i<= EndRow; i++){
        System.out.print(matrix[i][EndColumn] + " ");
      }

      //bottom part j for column
      for(int j=EndColumn -1;  j >= StartColumn;j-- ){
        if(StartRow == EndRow){
          break;
        }
        System.out.print(matrix[EndRow][j] + " ");
      }

      //left part i for row
      for(int i= EndRow -1; i >= StartRow + 1; i--){
        if(StartColumn == EndColumn){
          break;
        }
        System.out.print(matrix[i][StartColumn] +" ");
      }
      StartColumn++;
      StartRow++;
      EndColumn--;
      EndRow--;
    }

  }
  public static void main(String[] args) {
    int matrix[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
    Spiral(matrix);
  }
}
