

import java.util.Scanner;

public class LargestIn3DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int arr[][][] = new int[layers][rows][cols];

        System.out.println("Enter elements:");
        for(int i = 0; i < layers; i++) {
            System.out.println("Layer " + (i+1) + ":");
            for(int j = 0; j < rows; j++) {
                for(int k = 0; k < cols; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        int largest = arr[0][0][0];

        for(int i = 0; i < layers; i++) {
            for(int j = 0; j < rows; j++) {
                for(int k = 0; k < cols; k++) {
                    if(arr[i][j][k] > largest) {
                        largest = arr[i][j][k];
                    }
                }
            }
        }
        System.out.println("Largest element = " + largest);
        sc.close();
    }
}
