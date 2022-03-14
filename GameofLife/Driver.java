public class Driver{//start of class Driver
  public static void main(String[] args){//start of main
    //alive cell X, dead cell O, nothing blank

   Grid world1 = new Grid(10, 10);
   System.out.println(world1);
   System.out.println(world1.countNeighbors(8, 8)); // 0
   System.out.println(world1.countNeighbors(2, 5));

  }//end of main







}//end of class Driver
