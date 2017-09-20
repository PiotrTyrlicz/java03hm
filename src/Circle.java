public class Circle {
    double r;
    Circle(double r)
    {
        this.r=r;
    }
    public double calculateArea(){
        ShapeCalculator sc2 = new ShapeCalculator();
        return sc2.circleArea(this);
    }

}
