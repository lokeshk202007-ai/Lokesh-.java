abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    double radius = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    double length = 10;
    double width = 5;

    void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {

        Shape c = new Circle();
        Shape r = new Rectangle();

        c.area();
        r.area();
    }
}
