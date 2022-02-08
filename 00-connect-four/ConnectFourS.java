import java.util.*;

public class ConnectFourS{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int col = 0;
    int temp = 1;
    String[][] board = new String[6][7];
    int lengthc = 6;
    /*
    [][][][][][][]
    [][][][][][][]
    [][][][][][][]  6 rows 7 columns
    [][][][][][][]
    [][][][][][][]
    [][][][][][][] */
    //System.out.println(Arrays.deepToString(board));
    //while (!(winCheck)) {

    //}
    System.out.print("\033[H\033[2J");
    fillBoard(board);
    displayBoard(board);
    int turn = 2;
    boolean whilebool = true;
    while (whilebool) {
    if (turn % 2 == 0) {
      System.out.println("Player X, write the column you want to fill:");
      col = s.nextInt();
      for (int row = 5; row >= 0; row--) {
        if (board[row][col - 1].equals("[ ]")) {
          board[row][col - 1] = "[X]";
          break;
        }
      }
      if(winCheckhor(board,"[X]")) {
        System.out.println("WIN");
        whilebool = false;
      }
    }

    //displayBoard(board);
    turn = turn + 1;
    if (turn % 2 != 0) {
      displayBoard(board);
      System.out.println("Player O, write the column you want to fill:");
        col = s.nextInt();
        for (int row = 5; row >= 0; row--) {
          if (board[row][col - 1].equals("[ ]")) {
            //System.out.println(6-temp);
            board[row][col - 1] = "[O]";
            break;
          }
        }
        if(winCheckhor(board, "[O]")) {
          System.out.println("WIN");
          whilebool = false;
        }
      }
      System.out.print("\033[H\033[2J");
      displayBoard(board);
    }

  } // end main method
  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } // end inner loop
    } // end outer loop
  } // end fillBoard method

  public static void displayBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } // end inner for loop
      System.out.println();
    } // end outer for loop
  } // end displayBoard method

  public static boolean winCheckhor(String[][] board, String a) {//string a is "[X]" or "[O]"
      int temp = 0;
        for (int row = 0; row > 6; row++){//outer for loop
          for (int i = 0; i < 7; i++) {//inner for loop
            if (board[row][i].equals(a)) {//[a][][a][a][a][][] checks for 4 in a row
              temp++;
            }
            else {
              temp = 0;
            }
            if (temp == 4) {
              return true;
            }
          }//ends inner for loop
        }//ends outer for loop
        return false;
      }//end of function


} //end class
