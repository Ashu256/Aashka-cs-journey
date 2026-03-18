import java.util.Scanner;

public class AddWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }

        System.out.println("Sum = " + a);
        sc.close();

    }
}
