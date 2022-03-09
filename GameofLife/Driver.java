public class Driver{//start of class Driver
  public static void main(String[] args){//start of main
    //alive cell X, dead cell O, nothing blank

    int generation = 1;
    String[][] board = createBoard();
    Cell cell1 = new Cell(4,5);
    board[cell1.getX()][cell1.getY()] = "X";
    displayBoard(board);

  }//end of main
  

  public static String[][] createBoard(){ //createBoard function started
    String[][] board = new String[10][10];
    for (int row = 0; row < 10; row++){
      for (int col = 0; col < 10; col++){
        board[row][col] = "[]";
      }
    }
    return board;
  }//createBoard function ended

  public static void displayBoard(String board[][]){//displayBoard function started
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      }
    System.out.println();
    }
  }//displayBoard function ended


}//end of class Driver
