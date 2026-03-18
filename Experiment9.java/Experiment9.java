class Person9 {
    void getDetails() {
        System.out.println("I am a Person");
    }
}
class Employee9 extends Person9 {
    void getDetails() {
        System.out.println("I am an Employee");
    }
}
class Manager9 extends Employee9 {
    void getDetails() {
        System.out.println("I am a Manager");
    }
}
public class Experiment9 {
    public static void main(String[] args) {

        Person9 p = new Manager9();
        p.getDetails();
    }
}
