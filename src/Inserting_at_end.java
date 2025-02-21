import java.util.Scanner;

class Inserting_at_end
{
    public static void main(String[] args) {
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of index you wanna store 👉: ");
        index = sc.nextInt();

        int[] a = new int[index];
        System.out.println("Enter the elements of array 👉: ");
        for(int i = 0;i < index;i++)
        {
            a[i] = sc.nextInt();
        }

        int index2;
        int ele;

        System.out.println("Enter position of index which you wanna add in array 👉 : ");
        index2 = sc.nextInt();

        int[] b = new int[index + 1];
        System.out.println("Enter new element which is inserting : ");
        ele = sc.nextInt();

        for (int i = 0; i < index + 1; i++) {

            if(i < index2)
            {
                b[i] = a[i];
            }
            else if (i == index2)
            {
                b[i] = ele;
            }
            else {
                b[i] = a[i-1];
            }
        }
        System.out.println("Elements are : ");
        for (int i = 0; i < index + 1; i++) {
            System.out.println(b[i]);
        }
    }
}