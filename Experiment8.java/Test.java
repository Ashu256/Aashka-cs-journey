class Test {

    int instanceVar = 10;
    static int staticVar = 20;

    static void display() {

        Test obj = new Test();

        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        display();
    }
}


