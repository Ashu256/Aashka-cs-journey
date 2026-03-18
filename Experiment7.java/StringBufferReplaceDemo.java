

import java.util.Scanner;

public class StringBufferReplaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        StringBuffer sb = new StringBuffer(sentence);

        int start = sb.indexOf(oldWord);

        if(start != -1) {
            int end = start + oldWord.length();
            sb.replace(start, end, newWord);
            System.out.println("New sentence: " + sb);
        } else {
            System.out.println("Word not found.");
        }
        sc.close();
    }
}
