public class Tester{
  public static void main(String args[]) {
    Metrocard metrocard1 = new Metrocard("11111",4,1000);
    metrocard1.useuse(1100);
    System.out.println(metrocard1.toString());
  }
}
