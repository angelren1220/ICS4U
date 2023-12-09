package Final;

public class TicTacToe {
      
  private static char[][] board = new char[3][3];
  
  public static void main(String args[]) {
    ticTacToe();
  }

  public static void ticTacToe() {
    /*
     * This is where the all the logic of the game would start if you were coding a
     * full game.
     */
    /*
     * You have to code the method printBoard that can then be called
     * from here. The methods signature (including return type and
     * parameters) and body will depend on your code design and how you * have
     * decided to store your board. How the printed board looks also * depends on
     * your design.
     * Change the call to printBoard() below to match your method
     * 
     * 
     * 
     * 
     * signature once you are done coding it.
     * Hint - You probably want to be using an array.
     */

    printBoard();

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
