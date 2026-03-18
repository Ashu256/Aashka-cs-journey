class A {
    A() {
        System.out.println("Constructor of Class A");
    }
}
class B extends A {
    B() {
        System.out.println("Constructor of Class B");
    }
}
class C extends B {
    C() {
        System.out.println("Constructor of Class C");
    }
}
public class ConstructorChainTest {
    public static void main(String[] args) {

        new C();
    }
}


