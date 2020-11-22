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

  public boolean equals(RealNumber other){
    double a = Math.abs(value - other.value);
    if (a < (0.00001*value)){
      return true;
    }
    return false;
  }

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
