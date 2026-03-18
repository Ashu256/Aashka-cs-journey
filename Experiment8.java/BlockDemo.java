class BlockDemo {

    static {
        System.out.println("1. Static block executed");
    }
    {
        System.out.println("3. Instance block executed");
    }
    BlockDemo() {
        System.out.println("4. Constructor executed");
    }
    public static void main(String[] args) {

        System.out.println("2. Main method executed");

        new BlockDemo();

        new BlockDemo();
    }
}

