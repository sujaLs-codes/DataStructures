import java.util.Scanner;

/**
 * Solution
 */
public class Solution {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the quantity of the array : ");
        int quant = sc.nextInt();

        int arr[][] = new int[quant][quant];

        System.out.println("Enter the number of the element here : ");
        for (int i = 0; i < quant; i++) {
            for (int j = 0; j < quant; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < quant; i++) {
            for (int j = 0; j < quant; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
