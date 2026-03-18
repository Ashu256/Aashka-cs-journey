import java.util.Scanner;

public class ExpressionEvaluation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        System.out.print("Enter e: ");
        int e = sc.nextInt();

        int sum = a + b;
        int diff = c - d;
        int mul = sum * diff;
        int result = mul / e;
        System.out.println("Final Result = " + result);
        sc.close();

    }
}
