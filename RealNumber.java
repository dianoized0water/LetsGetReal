public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public boolean equals(RealNumber other){
    double a = value - other.value;
    if (Math.abs(a)> (0.00001*value)){
      return false;
    }
    return true;
  }

  public RealNumber add(RealNumber other){
    RealNumber c = new RealNumber(this.value + other.value);
    return c;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber c = new RealNumber(this.value * other.value);
    return c;
  }

  public RealNumber divide(RealNumber other){
    RealNumber c = new RealNumber(this.value / other.value);
    return c;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber c = new RealNumber(this.value - other.value);
    return c;
  }
}
