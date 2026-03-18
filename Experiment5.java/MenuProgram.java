import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Prime check");
        System.out.println("2. Factorial");
        System.out.println("3. Reverse number");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter number: ");
                int num = sc.nextInt();
                boolean isPrime = true;

                for(int i = 2; i <= num/2; i++) {
                    if(num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime)
                    System.out.println("Prime number");
                else
                    System.out.println("Not prime");
                break;

            case 2:
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                int fact = 1;

                for(int i = 1; i <= n; i++)
                    fact *= i;

                System.out.println("Factorial = " + fact);
                break;

            case 3:
                System.out.print("Enter number: ");
                int number = sc.nextInt();
                int rev = 0;

                while(number != 0) {
                    rev = rev * 10 + number % 10;
                    number /= 10;
                }

                System.out.println("Reverse = " + rev);
                break;

            default:
                System.out.println("Invalid choice");
        }
        sc.close();

    }
}
