import java.util.Scanner;
public class LeftRotaion {
    public static int[] rotateLeft(int[] arr, int d){
        int n = arr.length;
        int[] rotateArr = new int[n];

        for (int i = 0; i < n; i++) {
            rotateArr[i] = arr[(i + d) % n];
        }
        return rotateArr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values : ");

        int n = s.nextInt();
        int d = s.nextInt();

        int []arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = s.nextInt();
        }

        int[] result = rotateLeft(arr, d);

        for(int i = 0;i < n;i++){
            System.out.print(result[i] + " ");
        }
    }
}
