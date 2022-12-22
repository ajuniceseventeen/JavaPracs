package lab2.task3;

public class Circle {
    Point point;
    private double r;

    public Circle(double x, double y, double r) {
        point = new Point(x,y);
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Circle {" +
                 point +
                ", r = " + r +
                '}';
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    //------------------------------------//
    public double getArea()
    {
        return (Math.pow(3.14, 2) * this.r);
    }
    public double getLength()
    {
        return (2 * 3.14 * this.r);
    }
    public void circleComparsion(Circle secondCircle)
    {
        if (this.r > secondCircle.r)
            System.out.println("Первый круг больше.");
        else if (this.r < secondCircle.r)
            System.out.println("Второй круг больше.");
        else System.out.println("Они равны.");
    }
    //------------------------------------//
}
