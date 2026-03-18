class CalculateOverload {

    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    double calculate(double a, double b) {
        return a + b;
    }

    String calculate(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        CalculateOverload obj = new CalculateOverload();

        int sum2 = obj.calculate(10, 20);
        int sum3 = obj.calculate(5, 10, 15);
        double sumDouble = obj.calculate(3.5, 4.5);
        String concat = obj.calculate("Hello ", "World");

        System.out.println("Sum of two integers: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
        System.out.println("Sum of two doubles: " + sumDouble);
        System.out.println("Concatenation of two strings: " + concat);
    }
}


