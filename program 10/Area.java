public class Area
{
    // circle
    public double area(double r)
    {
        return Math.PI * r * r;
    }

    // rectangle
    public double area(double l, double w)
    {
        return l * w;
    }

    // triangle
    public double area(int b, int h)
    {
        return 0.5 * b * h;
    }

    // square
    public int area(int a)
    {
        return a * a;
    }

    public static void main(String[] args)
    {
        Area obj = new Area();

        System.out.println("Area of circle: " + obj.area(5));
        System.out.println("Area of rectangle: " + obj.area(3,4));
        System.out.println("Area of triangle: " + obj.area(4,3));
        System.out.println("Area of square: " + obj.area(8));
    }
}
