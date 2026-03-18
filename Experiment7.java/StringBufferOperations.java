
public class StringBufferOperations {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Delete
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
