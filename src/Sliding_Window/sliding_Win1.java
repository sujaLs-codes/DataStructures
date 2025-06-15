package Sliding_Window;
import java.util.Scanner;

public class sliding_Win1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your size : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        int maxSum = 0;
        int windowSum = 0;
        int k = 3;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];      // calculate sum of first window
        }
        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.print("Max Sum : " + maxSum);
    }
}
