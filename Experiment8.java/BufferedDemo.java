import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class BufferedDemo {

    int number = 0;

    BufferedDemo() {
        System.out.println("Constructor called");
        readAndAdd(); // calling instance method
    }
    void readAndAdd() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a number: ");
            int input = Integer.parseInt(br.readLine());

            number = number + input;

            System.out.println("Value added to instance variable.");

        } catch(IOException e) {
            System.out.println("Error reading input");
        }
    }
    void display() {
        System.out.println("Final value of instance variable: " + number);
    }
    public static void main(String[] args) {

        BufferedDemo obj = new BufferedDemo();

        obj.display();
    }
}

