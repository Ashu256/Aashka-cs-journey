class DefaultConstructorDemo {

    int number;

    void display() {
        System.out.println("Value of number: " + number);
    }

    public static void main(String[] args) {

        DefaultConstructorDemo obj = new DefaultConstructorDemo();

        obj.display();
    }
}

