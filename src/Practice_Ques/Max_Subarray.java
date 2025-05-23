package Practice_Ques;

import java.util.Scanner;

public class Max_Subarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter for element " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("<==================================>");
        System.out.println("Elements are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " is : " + arr[i]);
        }

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        System.out.println("<==================================>");
        System.out.println("Maximum Subarray Sum is : " + maxSoFar);
    }
}
