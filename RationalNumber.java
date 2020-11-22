public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super((double) nume*1.0/deno);
    if (deno==0){
      nume = 0;
      deno= 1;
    }
    if (deno<0){
      deno = deno * -1;
      nume = nume * -1;
    }
    numerator = nume;
    denominator = deno;
    reduce();
  }

  public double getValue(){
    return (numerator*1.0 / denominator);
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(this.denominator, this.numerator);
  }

  public String toString(){
    String a = "";
    if (numerator==0){
      a = "0";
    }
    else {
      a = numerator + " / " + denominator;
    }
    return a;
  }

  private static int gcd(int a , int b){
    if (a<0){a=-a;}
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
    int b = denominator * other.getDenominator();
    return new RationalNumber(a, b);
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    int d = other.denominator * numerator;
    int e = denominator * other.numerator;

    return new RationalNumber((d+e), other.denominator*denominator);
  }

  public RationalNumber subtract(RationalNumber other){
    int a = other.numerator * -1;
    RationalNumber b = new RationalNumber(a, other.denominator);
    return add(b);
  }
}
