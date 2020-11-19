public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
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
}
