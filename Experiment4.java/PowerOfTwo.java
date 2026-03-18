import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num > 0 && (num & (num - 1)) == 0)
            System.out.println("It is power of 2");
        else
            System.out.println("It is not power of 2");
        sc.close();

    }
}
