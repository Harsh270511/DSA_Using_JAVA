//this is the problem-3 to solve for nQueen
package L18BackTracking;

public class notes6 {
  public static boolean isSafe(char[][] board, int row, int col) {
    // vetical
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    // left-up diagonal
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    // right-up diagonal
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static boolean nQueen(char[][] board, int row) {
    if (row == board.length) {
      count++;
      return true;
    }
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        if (nQueen(board, row + 1)) {
          return true;
        }
        board[row][j] = 'x';
      }
    }
    return false;
  }

  public static void printBoard(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int count = 0;

  public static void main(String[] args) {
    int n = 5;
    char[][] board = new char[n][n];
    // initilization
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = 'x';
      }
    }
    if (nQueen(board, 0)) {
      System.out.println("solution is possible");
      printBoard(board);
    } else {
      System.out.println("Solution not possible");
    }
  }
}
