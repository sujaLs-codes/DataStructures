import java.util.ArrayList;
import java.util.Collections;

public class Collection_sort {
    public static void main(String[] args) {
        //String[] fruit = {"Apple","Orange","Pineapple","Banana","Grape","Watermelon","Jamb",};

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Graps");
        fruit.add("Banana");
        fruit.add("Pineapple");

        System.out.println("Before Sort : ");
        System.out.println(fruit);

        Collections.sort(fruit);

        System.out.println("After SOrt : ");
        System.out.println(fruit);
    }
}
