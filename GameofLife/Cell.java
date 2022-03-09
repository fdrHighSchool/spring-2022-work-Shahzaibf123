import java.util.*;
public class Cell{
  private int x;
  private int y;
  private int DoA;
  public Cell(int x, int y){
    this.x = x;
    this.y = y;
    DoA = 0;
  }

  public int status(){
    double random = Math.random()
    this.DoA = (random > .5) ? 1 : 0;
    // if the statement in () is true the first is returned else the second is returned
    return DoA;
  }

  public int getX(){
    return this.x;
  }
  public int getY(){
    return this.y;
  }





}
