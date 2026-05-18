//N-Queen leetcode problem number:52 (problem number 2)
package ApnaCollege.L18BackTracking;
public class notes5 {
  //function for isSafe
  public static boolean isSafe(char[][] board, int row, int col){
    //vertically up direction
    for(int i=row-1; i>=0 ;i--){
      if(board[i][col]=='Q'){
        return false;
      }
    }
    //left up diagonal
    for(int i=row-1, j=col-1; i>=0 && j>=0;i--, j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    //right up diagonal
    for(int i=row-1, j=col+1; i >=0 && j <board.length; i--, j++){
      if(board[i][j]=='Q'){
        return false;
      }
    }
    return true;

  }
  //*****************************************************************************************/

  public static void nQueen(char board[][], int row) {
    // base case
    if (row == board.length) {
      
      count++;
      return;
    }
    // column loop
    for (int j = 0; j < board.length; j++) {
      if(isSafe(board, row, j)){
        board[row][j] = 'Q';
        nQueen(board, row + 1);// function calling
        board[row][j] = 'x';// backtracking step
      }
      
    }
  }

  public static void printBoard(char board[][]) {
    System.out.println("------Chess board-------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int count=0;
  public static void main(String[] args) {
    int n = 5;
    char board[][] = new char[n][n];
    // initilization
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'x';
      }
    }
    nQueen(board, 0);
    System.out.println("The number of ways of N-Queens : "+ count);

  }

}
