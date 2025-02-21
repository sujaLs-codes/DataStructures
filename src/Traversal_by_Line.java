public class Traversal_by_Line {
    public static void main(String[] args) {

        int arr[] = {2,55,775,33,6778,2345,23563,766,54345,7543,235,3456,23345};

        System.out.println("Print using for loop..");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Print using for each loop...");
        for(int element : arr)
        {
            System.out.println(element);
        }
    }
}
