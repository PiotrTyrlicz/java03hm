public class Square {
    double a;
    Square(double a)
    {
        this.a=a;
    }
public double calculateArea (){
        ShapeCalculator sc2 = new ShapeCalculator();
        return sc2.squareArea(this);

}

};
