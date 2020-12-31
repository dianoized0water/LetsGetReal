public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
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

  public double getValue(){ // overrides
    return 1.0 * numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }

  public String toString(){
    if (numerator==0){
      return "0";
    }
    if (denominator==1){
      return ""+numerator;
    }
    else {
      return numerator + "/" + denominator;
    }
  }

  public boolean equals(RationalNumber other){
    return ((numerator == other.numerator) && (denominator == other.denominator));
  }

  private static int gcd(int a , int b){
    int gcd = 1;
    for(int i=1; i<=a && i<=b; i++){
      if (a%i==0 && b%i==0)
      gcd = i;
    }
    return gcd;
  }

  private void reduce(){
    int c = gcd(numerator, denominator);
    numerator = numerator / c;
    denominator = denominator / c;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    int d = other.getDenominator() * numerator;
    int e = denominator * other.getNumerator();
    return new RationalNumber((d+e), (other.getDenominator()*denominator));
  }

  public RationalNumber subtract(RationalNumber other){
    return add(other.multiply(new RationalNumber(-1, 1)));
  }
}
