
public class StringComparisonDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("Hello");

        if(s1 == s2) {
            System.out.println("Using == : Strings are equal");
        } else {
            System.out.println("Using == : Strings are not equal");
        }

        if(s1.equals(s2)) {
            System.out.println("Using equals() : Strings are equal");
        } else {
            System.out.println("Using equals() : Strings are not equal");
        }
    }
}
