import java.util.Scanner;

public class SmallestLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int smallest = 9;
        int largest = 0;

        while(num != 0) {
            int digit = num % 10;

            if(digit < smallest)
                smallest = digit;

            if(digit > largest)
                largest = digit;

            num /= 10;
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Largest digit = " + largest);
        sc.close();

    }
}
