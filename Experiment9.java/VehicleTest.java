class Vehicle {
    void display() {
        System.out.println("This is Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        super.display();   
        System.out.println("This is Car");
    }
}

public class VehicleTest {
    public static void main(String[] args) {

        Car c = new Car();
        c.display();

    }
}


