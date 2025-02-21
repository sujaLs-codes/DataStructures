import java.util.Scanner;

public class Deletion_of_Array {
    public static void main(String[] args) {
        int index;
        int index2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of index you wanna store 👉: ");
        index = sc.nextInt();

        int[] a = new int[index];
        int[] b = new int[index - 1];


        for(int i = 0;i < index;i++)
        {
            System.out.println("Enter the elements of array 👉: ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter position of index which you wanna DELETE from array 👉 : ");
        index2 = sc.nextInt();

        for (int i = 0; i < a.length; i++) {

            if(i < index2)
            {
                b[i] = a[i];
            }
            else {
                b[i-1] = a[i];
            }
        }
        System.out.println("Elements are : ");
        for (int i = 0; i < index - 1; i++) {
            System.out.println(b[i]);
        }
    }
}
