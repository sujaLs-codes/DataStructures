import java.util.Scanner;
//import static java.lang.System.*;
public class Insert_1or_more_ele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many element you want to store 👉 : ");
        int index = s.nextInt();

        int a[] = new int[index];
        System.out.println("Enter the elements for creating array list 👉 : ");
        for (int i = 0; i < index; i++) {
            a[i] = s.nextInt();
        }
        // Taking input for new element to insert
        System.out.println("Enter the number of new element you want to insert 👉:");
        int numnewElement = s.nextInt();

        // Create arrays to store the new element and their positions
        int[] newElements = new int[numnewElement];
        int[] position = new int[numnewElement];

        // Input to take new elements and their position

        for (int i = 0; i < numnewElement; i++) {
            System.out.println("Enter the position where you want to insert element " + (i + 1) + ": ");
            position[i] = s.nextInt();
            System.out.println("Enter the new element to inssert at the position " + position[i] + ": ");
            newElements[i] = s.nextInt();
        }

        //calculate the size of the new array
        int newSize = index + numnewElement;
        int[] b = new int[newSize];

        int originalIndex = 0, newIndex = 0, insertionIndex = 0;

        // OriginalIndex is initialized to 0 to start copying from the beginning of the original array 'a'.
        // newIndex keeps track of which new element we are currently inserting.
        // insertionIndex is the index for the new array 'b'

        while(insertionIndex < newSize)
        {
            if(newIndex < numnewElement && insertionIndex == position[newIndex]){
                //newIndex track the new elements we are currently inserting in that position.
                //also checks if the current insertionIndex matches the position where a new element should be inserted.
                b[insertionIndex] = newElements[newIndex];
                newIndex++;
            }
            else {
                b[insertionIndex] = a[originalIndex];
                /*originalIndex is initialized to 0 to
                start copying from the beginning of the original array a*/
                originalIndex++;
            }
            insertionIndex++;
        }
        System.out.println("Elements in the new array : ");
        for (int i = 0; i < newSize; i++) {
            System.out.println(b[i]);
        }
    }
}
