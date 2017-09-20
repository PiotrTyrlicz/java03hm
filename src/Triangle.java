public class Triangle {
    double a,b,c;
    Triangle(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double calculatePerimeter(){
        ShapeCalculator sc2 = new ShapeCalculator();
        return sc2.trianglePerimeter(this);
    }
}
