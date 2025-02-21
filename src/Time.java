import java.util.*;
import java.util.Scanner;
public class Time {
    public static void main(String[] args){
        int arr[] = new int[4];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of array : ");
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.print("Printing original array : ");
        for(int j : arr){
            System.out.println(j);
        }
        System.out.println("Printing clone of the array : ");
        int carr[] = arr.clone();;
        for(int k : carr)
        {
            System.out.println(k);
        }
        System.out.println("Are both equal? ");
        System.out.println(arr == carr);
    }
}
