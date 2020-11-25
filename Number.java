public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    double a = (this.getValue()-other.getValue());
    if (a==0){
      return 0;
    }
    if (a>0){
      return 1;
    }
    else {
      return -1;
    }
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
