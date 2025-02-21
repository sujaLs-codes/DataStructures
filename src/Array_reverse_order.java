public class Array_reverse_order {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Reversal Order Array");

        for (int i = arr.length -1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
