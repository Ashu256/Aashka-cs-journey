class VariableDemo {

    int x;
    int y;

    static int z;

    void display() {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {

        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        obj1.x = 10;
        obj1.y = 20;
        VariableDemo.z = 30;

        obj2.x = 100;
        obj2.y = 200;
        VariableDemo.z = 300;

        System.out.println("Object 1 values:");
        obj1.display();

        System.out.println("Object 2 values:");
        obj2.display();
    }
}