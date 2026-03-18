import java.util.Scanner;

public class OverflowCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > Integer.MAX_VALUE / 2 || num < Integer.MIN_VALUE / 2) {
            System.out.println("Overflow will occur");
        } else {
            System.out.println("Result = " + (num * 2));
        }
        sc.close();

    }
}
