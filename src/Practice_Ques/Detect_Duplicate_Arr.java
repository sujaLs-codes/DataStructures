package Practice_Ques;

import java.util.HashSet;
import java.util.Scanner;

public class Detect_Duplicate_Arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int sizes = scanner.nextInt();

        int[] arr = new int[sizes];
        for (int i = 0; i < sizes; i++) {
            System.out.print("Enter element for index " + i + " = ");
            arr[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for (int i = 0; i < sizes; i++) {
            if(set.contains(arr[i])){
                hasDuplicate = true;
                break;
            }
            else {
                set.add(arr[i]);
            }
        }

        if(hasDuplicate){
            System.out.println("True --> Duplicate Exist");
        } else {
            System.out.println("False --> All elements are unique");
        }
     }
}
