package SEARCHs;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The index = ");
        int index = scanner.nextInt();
        int[] elements = new int[index];
        for (int i = 0; i < index; i++) {
            System.out.print("Enter the number for " + i + " element : ");
            elements[i] = scanner.nextInt();
        }
        System.out.println("<===============================================>");
        System.out.print("Enter the number which you search : ");
        int find = scanner.nextInt();
        boolean IsInArray = false;
        for(int element : elements){
            if(find == element){
                IsInArray = true;
                break;
            }
        }
        System.out.println("<===============================================>");
        if(IsInArray){
            System.out.println("This number is in array...");
        }
        else {
            System.out.println("Not Available");
        }
    }
}
