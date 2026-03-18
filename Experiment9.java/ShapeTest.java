class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}
class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle");
    }
}
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle");
    }
}
class Triangle extends Shape {
    void area() {
        System.out.println("Area of Triangle");
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape s[] = {
                new Circle(),
                new Rectangle(),
                new Triangle()
        };
        for (Shape obj : s)
            obj.area();
    }
}


