import java.util.Arrays;
import java.util.Collections;

public class Reversable_CollentN_Sort {
    public static void main(String[] args) {

        String[] names = {"Apple", "Orange" , "Mango", "Banana", "Graps"};

        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(names));

        Arrays.sort(names, Collections.reverseOrder());

        System.out.println("After Sorting in descending order : ");
        System.out.println(Arrays.toString(names));
    }
}
