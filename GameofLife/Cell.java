import java.util.*;
public class Cell{

  private int DoA;

  public Cell(int DoA){
    this.DoA = DoA;

  }

  public int getStatus(){
    return DoA;
  }


  public String toString() {
    if(this.status == 0) {
      return "X";
    }
    else {
      return "O";
    }
  }




}
