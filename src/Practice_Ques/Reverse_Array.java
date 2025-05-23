package Practice_Ques;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        int sizes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size for arrayList: ");
        sizes = scanner.nextInt();

        int[] arr = new int[sizes];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element for " + i + " position : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " element is : " + arr[i]+" ");
        }
        System.out.println("Reverse array elements:");
        for (int i = arr.length -1; i >= 0 ; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
