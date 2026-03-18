class Animal {

    Animal getObject() {
        System.out.println("Returning Animal Object");
        return this;
    }
}
class Dog extends Animal {

    // Overriding with covariant return type
    Dog getObject() {
        System.out.println("Returning Dog Object");
        return this;
    }
}
public class AnimalTest {
    public static void main(String[] args) {

        Animal a = new Dog();   // parent reference
        a.getObject();

    }
}


