

import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String trimmed = str.trim();

        String upper = trimmed.toUpperCase();

        String lower = trimmed.toLowerCase();

        System.out.println("Original string: " + str);
        System.out.println("After trim(): " + trimmed);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        sc.close();
    }
}
