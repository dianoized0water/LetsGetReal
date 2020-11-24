public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    return (int) (this.getValue()-other.getValue());
  }

  public boolean equals(Number other){
    double a = this.getValue();
    double b = other.getValue();
    if ((a==0) || (b==0)){
      return (a==b);
    }
    else {
      return ((Math.abs(a-b)*100 / Math.abs(a+b)/2) < 0.001);
    }
  }
}
