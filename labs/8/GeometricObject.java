//Steven Loughran
//Lab 8
//April 19, 2019

public class GeometricObject {
  private String Tcolor;
  private boolean isfilled;

  public String getcolor() {
    return Tcolor;
  }

  public void putcolor(String c) {
    this.Tcolor = c;
  }

  public boolean isFilled() {
    return isfilled;
  }

  public void setFill(boolean fill) {
    isfilled = fill;
  }


  public String toString() {
    return "\ncolor: " + Tcolor + " and filled: " + filled;
  }
}
