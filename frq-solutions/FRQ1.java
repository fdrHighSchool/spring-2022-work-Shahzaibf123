import java.util.*;
public class FRQ1{
  public static void main(String[] args) {
    // int [][] arr = new int[4][3];
    int [][] arr = new int[][] { {2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};
    isNonZeroRow(arr, arr.length - 1);
    // calling nonZero 2d arrays
    int [][] smaller = resize(arr);
    System.out.println(numNonZeroRows(arr));
    System.out.println(Arrays.deepToString(smaller));
  }

  public static boolean isNonZeroRow(int [][] array2D, int r) {
    for(int c = 0; c < array2D[0].length; c++) {
      if(array2D[r][c] == 0) {
        return false;
      }

    }
    return true;
  }

  public static int numNonZeroRows(int[][] array2D) {
    int temp = 0;
    for (int r = 0; r < array2D.length;r++) {
      for (int c = 0; c < array2D[0].length;c++){
        if (array2D[r][c] == 0) {
          temp++;
          break;
        }
      }
    }
    return array2D.length - temp;
  }


  public static int[][] resize(int[][] array2D) {
    int[][] placeholder = new int[numNonZeroRows(array2D)][array2D[0].length];
    int temp = 0;
    for (int r = 0; r < array2D.length;r++){
      if (isNonZeroRow(array2D, r)) {
        for (int col = 0; col < array2D[0].length; col++) {
          placeholder[temp][col] = array2D[r][col];
        }
        temp++;
      }
    }
    return placeholder;
  }
}
