public class Metrocard {
  private String id;
  private int numrides;
  private int Currenttime;

  public Metrocard(String id){
    this.id = id;
    this.numrides = 0;
    this.Currenttime = 900;
  }

  public Metrocard(String id, int numrides){
    this.id = id;
    this.numrides = numrides;
    this.Currenttime = 900;
  }

  public Metrocard(String id, int numrides, int Currenttime){
    this.id = id;
    this.numrides = numrides;
    this.Currenttime = Currenttime;
  }

  public String toString(){
    return "This metrocard has the id number of " + this.id + " with approximately " + numrides + " rides left.";
  }

  public boolean Canuse(){ //timeoriented
    if (this.Currenttime > 530 && this.Currenttime < 2030){
      return true;
    }
    else {
      return false;
    }
  }

  public int Adduse(){
    return this.numrides++;
  }

  public void useuse(int time){
    if (Canuse()){
      if (this.numrides > 0 && time - this.Currenttime > 15){
        System.out.println("Have a good ride!");
        this.numrides = this.numrides - 1;
        this.Currenttime = time;
      }
    }
    else {
      System.out.println("ERROR: Card can not be used.");//nothing happens, card wasnt used
    }
  }

public void refresh(){
  this.numrides = 3;
}

  public boolean Enoughuses(){//rides-oriented
    if (numrides > 0){
      return false;
    }
    else{
      return true;
    }
  }
}
