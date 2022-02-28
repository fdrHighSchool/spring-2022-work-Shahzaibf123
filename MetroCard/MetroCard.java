public class Metrocard {
  private String id;
  private int moneyleft;
  private int Currenttime;

  public Metrocard(String id){
    this.id = id;
    this.moneyleft = 0;
    this.Currenttime = 900;
  }

  public Metrocard(String id, int moneyleft){
    this.id = id;
    this.moneyleft = moneyleft;
    this.Currenttime = 900;
  }
  public Metrocard(String id, int moneyleft, int Currenttime){
    this.id = id;
    this.moneyleft = moneyleft;
    this.Currenttime = Currenttime;
  }
  public String toString(){
    return "This metrocard has the id number of " + this.id + " with approximately " + (double)(this.moneyleft/100) + " dollars left.";
  }
  public String doubleuse(){
    return "Can not be swiped within 20-minute windows";
  }
  public boolean Canuse(){ //timeoriented
    if (Currenttime > 530 && Currenttime < 2030){
      return true;
    }
    else {
      return false;
    }
  }
  public int Adduse(){
    return this.moneyleft + 275;
  }

  public int useuse(){
    if (Canuse()){
    return this.moneyleft - 275;
    }
    else {
      return this.moneyleft;//nothing happens, card wasnt used
    }
  }

  public boolean Enoughuses(){//money-oriented
    if (moneyleft < 275){
      return false;
    }
    else{
      return true;
    }
  }
}
