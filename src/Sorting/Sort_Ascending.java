package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an aarray : ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number for (" + i + ") element => ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("<==================================================>");
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
