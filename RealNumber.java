public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public String toString(){
    return ""+value;
  }

  public double getValue(){
    return value;
  }
/*
  public boolean equals(RealNumber other){
    double a = value;
    double b = other.value;
    if ((a==0) || (b==0)){
      return (a==b);
    }
    else {
      return ((Math.abs(a-b)*100 / Math.abs(a+b)/2) < 0.001);
    }
  }
*/
  public RealNumber add(RealNumber other){
    return new RealNumber(this.value + other.value);
  }

  public RealNumber multiply(RealNumber other){
    return new RealNumber(this.value * other.value);
  }

  public RealNumber divide(RealNumber other){
    return new RealNumber(this.value / other.value);
  }

  public RealNumber subtract(RealNumber other){
    return new RealNumber(this.value - other.value);
  }
}
