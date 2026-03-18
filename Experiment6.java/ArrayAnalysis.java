
import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int negativeCount = 0;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] < 0) {
                negativeCount++;
            }
            sum += arr[i];
        }
        double average = (double) sum / n;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Experiment3.Average = " + average);
        System.out.println("Negative numbers count = " + negativeCount);

        sc.close();
    }
}
