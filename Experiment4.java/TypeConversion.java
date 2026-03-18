public class TypeConversion {
    public static void main(String[] args) {

        int a = 10;
        double b = a;

        double x = 10.75;
        int y = (int)x;

        System.out.println("Implicit conversion: " + b);
        System.out.println("Explicit conversion: " + y);
    }
}
