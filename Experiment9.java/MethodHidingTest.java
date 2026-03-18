class Parent {

    static void show() {
        System.out.println("Static Method of Parent");
    }
}
class Child extends Parent {

    static void show() {
        System.out.println("Static Method of Child");
    }
}
public class MethodHidingTest {
    public static void main(String[] args) {

        Parent.show();
        Child.show();
    }
}


