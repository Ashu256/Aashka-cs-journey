import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        System.out.print("Left Rotation: ");
        leftRotate(arr, n, k);

        System.out.print("\nRight Rotation: ");
        rightRotate(arr, n, k);

        sc.close();   // ✅ fixes yellow warning
    }

    public static void leftRotate(int arr[], int n, int k) {
        k = k % n;

        for (int i = k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rightRotate(int arr[], int n, int k) {
        k = k % n;

        for (int i = n - k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n - k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}