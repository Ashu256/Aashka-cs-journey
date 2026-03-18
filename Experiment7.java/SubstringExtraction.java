
import java.util.Scanner;

public class SubstringExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter starting index: ");
        int start = sc.nextInt();

        String sub1 = str.substring(start);

        System.out.print("Enter starting index: ");
        int start2 = sc.nextInt();

        System.out.print("Enter ending index: ");
        int end2 = sc.nextInt();

        String sub2 = str.substring(start2, end2);

        System.out.println("Substring from given index: " + sub1);
        System.out.println("Substring between two indices: " + sub2);

        sc.close();
    }
}
