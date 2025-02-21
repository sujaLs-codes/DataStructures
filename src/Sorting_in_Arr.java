import java.util.Arrays;
import java.util.Scanner;

public class Sorting_in_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter num of fruits name : ");
        num = sc.nextInt();

        String[] fruits = new String[num];
        System.out.println("Enter the Fruits of names : ");
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = sc.nextLine();
        }

        System.out.println("before sorting : ");
        System.out.println(Arrays.toString(fruits));

        Arrays.sort(fruits);

        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(fruits));
    }
}
