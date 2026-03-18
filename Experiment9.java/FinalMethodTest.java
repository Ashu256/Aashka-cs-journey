class Base {

    final void display() {
        System.out.println("This is Final Method in Base class");
    }
}
class Derived extends Base {
}
public class FinalMethodTest {
    public static void main(String[] args) {

        Derived d = new Derived();
        d.display();
    }
}




