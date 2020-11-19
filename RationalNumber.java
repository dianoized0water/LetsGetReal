public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super((double)(nume/deno));
    if (deno==0){
      nume = 0;
      deno= 1;
    }
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return (double) (numerator / denominator);
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber c = new RationalNumber(this.denominator, this.numerator);
    return c;
  }

  public String toString(){
    return ""+getValue();
  }

  private static int gcd(int a , int b){
    while (!(a==b)){
      if (a>b){
        a = a-b;
      }
      else {
        b = b-a;
      }
    }
    return a;
  }

  private void reduce(){
    int c = gcd(numerator, denominator);
    numerator = numerator / c;
    denominator = denominator / c;
  }

  public RationalNumber multiply(RationalNumber other){
    int a = numerator * other.getNumerator();
    int b = numerator * other.getDenominator();
    RationalNumber c = new RationalNumber(a, b);
    return c;
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  private static int lcm(int a, int b){
    int c = gcd(a, b);
    return (int) (a*b/c);
  }
}
