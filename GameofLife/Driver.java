public class Driver{//start of class Driver
  public static void main(String[] args){//start of main
    //alive cell X, dead cell O, nothing blank

    int generation = 1;
    String[][] board = createBoard();
    board = setBoard(board);
    displayBoard(board);

  }//end of main




  public static String[][] setBoard(String [][] board){
    for (int row = 0; row < 10; row++){
      for (int col = 0; col < 10; col++){
        board[row][col] = (Math.random() > .5) ? "X" : "";
      }
    }
    return board;
  }

  public static String[][] createBoard(){ //createBoard function started
    String[][] board = new String[10][10];
    for (int row = 0; row < 10; row++){
      for (int col = 0; col < 10; col++){
        board[row][col] = "";
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
