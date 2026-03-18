

import java.util.Scanner;

public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int firstIndex = str.indexOf(sub);

        int lastIndex = str.lastIndexOf(sub);

        if(firstIndex != -1) {
            System.out.println("First occurrence at index: " + firstIndex);
            System.out.println("Last occurrence at index: " + lastIndex);
        } else {
            System.out.println("Substring not found.");
        }
        sc.close();
    }
}
