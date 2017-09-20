public class Rectangle {
    double a,b;
    Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }
   public double calculatePerimeter(){
    ShapeCalculator sc2 = new ShapeCalculator();
        return sc2.rectPerimeter(this);
   }
}
