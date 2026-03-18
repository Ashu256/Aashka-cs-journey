

public class StringImmutabilityDemo {
    public static void main(String[] args) {

        String str1 = "Hello";

        System.out.println("Original string: " + str1);
        System.out.println("Original reference: " + str1.hashCode());

        String str2 = str1.concat(" World");

        System.out.println("New string after concatenation: " + str2);
        System.out.println("New reference: " + str2.hashCode());

        System.out.println("Original string after concatenation: " + str1);
        System.out.println("Original reference after concatenation: " + str1.hashCode());
    }
}
