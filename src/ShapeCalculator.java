public class ShapeCalculator {
    double squareArea(Square square){
        double wynik = square.a*square.a;
        return  wynik;
    }
    double circleArea(Circle cirle){
        double wynik = Math.PI*cirle.r*cirle.r;
        return  wynik;
    }
    double trianglePerimeter(Triangle triangle){
        double wynik = triangle.a + triangle.b+ triangle.c;
        return  wynik;
    }
    double rectPerimeter(Rectangle rectangle){
        double wynik = rectangle.a*2+rectangle.b*2;
        return  wynik;
    }

}
