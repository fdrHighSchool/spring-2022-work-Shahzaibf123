public class MetroCard {
  private String id;
  private int usesleft;

}
  public Metrocard(String id){
    this.id = id;
    this.usesleft = 0;
  }
  public Metrocard(String id, int usesleft){
    this.id = id;
    this.usesleft = usesleft;
  }

  public int Adduse(){
    return this.usesleft + 1;
  }

  public int useuse(){
    return this.uses - 1;
  }

  public boolean Enoughuses(){
    if (usesleft == 0){
      return false;
    }
    else{
      return true;
    }
  }
