

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result1 = str1.concat(str2);

        String result2 = str1 + str2;

        System.out.println("Using concat() method: " + result1);
        System.out.println("Using + operator: " + result2);

        sc.close();
    }
}
