

public class StringCreation {
    public static void main(String[] args) {

        String str1 = "Hello World";

        String str2 = new String("Java Programming");

        char ch[] = {'C', 'o', 'd', 'i', 'n', 'g'};
        String str3 = new String(ch);

        System.out.println("String using literal: " + str1);
        System.out.println("String using new String(): " + str2);
        System.out.println("String using character array: " + str3);
    }
}
