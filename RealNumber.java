public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
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
