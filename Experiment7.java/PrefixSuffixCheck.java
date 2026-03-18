
import java.util.Scanner;

public class PrefixSuffixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the prefix: ");
        String prefix = sc.nextLine();

        System.out.print("Enter the suffix: ");
        String suffix = sc.nextLine();

        if(str.startsWith(prefix)) {
            System.out.println("The string starts with the given prefix.");
        } else {
            System.out.println("The string does not start with the given prefix.");
        }

        if(str.endsWith(suffix)) {
            System.out.println("The string ends with the given suffix.");
        } else {
            System.out.println("The string does not end with the given suffix.");
        }

        sc.close();
    }
}
