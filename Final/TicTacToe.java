package Final;

public class TicTacToe {

  private static char[][] board = new char[3][3];

  public static void main(String args[]) {
    initializeBoard();
    ticTacToe();
  }

  public static void ticTacToe() {

    printBoard();

  }

  /*
   * Method initializeBoard
   */

  public static void initializeBoard() {
    // Fill the board with spaces indicating empty positions
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }
  }

  /*
   * Method printBoard()
   */
  public static void printBoard() {
    // Iterate through each row and column of the board
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j]);
        // Print vertical lines between columns
        if (j < 2) {
          System.out.print(" | ");
        }
      }
      System.out.println();
      // Print horizontal line between rows except for the last one
      if (i < 2) {
        System.out.println("---------");
      }
    }
  }

}
