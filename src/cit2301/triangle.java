package cit2301;

/**
 *
 */
public class triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public triangle()
    {
    }

    public triangle(double Side1, double Side2, double Side3, String color, boolean filled)
    {
        super(color,filled);
        this.side1 = Side1;
        this.side2 = Side2;
        this.side3 = Side3;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter()
    {
        return (side1+side2+side3);
    }

    @Override
    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 +"\n"
    + super.toString() +"\n";
    }
}
