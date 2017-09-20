import java.awt.*;

public class Test {
    public static void main(String[] args) {
        // Zadanie 1
        System.out.println("Zadanie 1 - telewizja");
        Televisor tv1 = new Televisor();
        tv1.showStatus();
        tv1.turnOn();
        tv1.showStatus();
        tv1.turnOff();
        tv1.showStatus();


        //Zadanie 2.1
        System.out.println("\nZadanie 2.1 - pola i obwody");
        ShapeCalculator shapeCalculator1 = new ShapeCalculator();

        Square square1 = new Square(2.5);
        System.out.print("Pole kwadratu; ");
        System.out.println(shapeCalculator1.squareArea(square1));

        Circle circle1 = new Circle(4);
        System.out.print("Pole koła: ");
        System.out.println(shapeCalculator1.circleArea(circle1));

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.print("Obwód trójkąta: ");
        System.out.println(shapeCalculator1.trianglePerimeter(triangle1));

        Rectangle rectangle1 = new Rectangle(5,10);
        System.out.print("Obwód prostokąta: ");
        System.out.println(shapeCalculator1.rectPerimeter(rectangle1));


        //Zadanie 2.2
        System.out.println("\nZadanie 2.2");

        Rectangle	rectangle2	=	new	Rectangle(5,	10);
        double	rectPerimeter	=	rectangle2.calculatePerimeter();
        System.out.println(rectPerimeter);	//wyświetla

        Triangle triangle2	=	new	Triangle(5,	10, 6);
        double	trianPerimeter	=	triangle2.calculatePerimeter();
        System.out.println(trianPerimeter);	//wyświetla

        Square square2 = new Square(3);
        double squareArea = square2.calculateArea();
        System.out.println(squareArea);

        Circle circle2 = new Circle(5);
        double circleArea = circle2.calculateArea();
        System.out.println(circleArea);

    }
}
