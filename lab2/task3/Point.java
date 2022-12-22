package lab2.task3;

public class Point {
     private double x, y;

     public Point(double x, double y) {
          this.x = x;
          this.y = y;
     }

     @Override
     public String toString() {
          return "x = " + x +
                  ", y = " + y
                  ;
     }

     public double getX() {
          return x;
     }

     public void setX(double x) {
          this.x = x;
     }

     public double getY() {
          return y;
     }

     public void setY(double y) {
          this.y = y;
     }

     public void setXY(double x, double y) {
          this.y = y;
          this.x = x;
     }
}
