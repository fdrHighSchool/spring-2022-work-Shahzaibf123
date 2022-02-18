public class Rationaltool{

  private int numerator;
  private int denominator;

  public Rational(){
    this.numerator = 0;
    this.denominator = 1;
  }

  public Rational(int num, int den) {
    this.numerator = num;
    this.denominator = den;
  }

  public void printRational(){
    System.out.println(this.numerator + "/" + this.denominator);
  }

  public String toString(){
    return this.numerator + "/" + this.denominator;
  }

  public void negate(){
    this.numerator = -this.numerator;
  }


  public void inverse(){
    int temp = this.numerator;
    this.numerator = this.denominator;
    this.denominator = temp;
  }


  public Double toDouble(){
    return (double)this.numerator / this.denominator;
  }

  public String reduce(){
    int num1 = this.numerator;
    int den1 = this.denominator;
    int gcd = 1;
    int ans;
    for (int i = 1; i <= num1 && i <= den1; i++){
      if (num1%i == 0 && den1%i==0){
        gcd = i;
      }
    }
    num1 = num1 / gcd;
    den1 = den1 / gcd;
    if (num1 % den1 == 0){
      ans = num1/den1;
      return ans + "";
    }
    else {
      return num1 + "/" + den1;
    }
  }
  public String add(Rational that) {
    int newnum = this.numerator * that.numerator;
    int newden = this.denominator * that.denominator;
    return newnum + "/" + newden;
  }

}
