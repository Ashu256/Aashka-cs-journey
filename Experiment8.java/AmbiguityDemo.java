class AmbiguityDemo {

    void display(int a, float b) {
        System.out.println("Method with (int, float) called");
    }

    void display(float a, int b) {
        System.out.println("Method with (float, int) called");
    }

    public static void main(String[] args) {

        AmbiguityDemo obj = new AmbiguityDemo();

        obj.display(10, 10.0f);
    }
}

