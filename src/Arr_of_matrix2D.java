import java.util.Scanner;

public class Arr_of_matrix2D {
    public static void main(String[] args) {
        int [][] ele = new int[3][4];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any 9 elements");

        /* ele[0][0] = 101; ele[1][0] = 104;
        ele[0][1] = 102; ele[1][1] = 105;
        ele[0][2] = 103; ele[1][2] = 106; */

        for (int i = 0; i < ele.length; i++) {
            for (int j = 0; j < ele[i].length; j++) {
                ele[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        int i;
        for (i = 0; i < ele.length; i++) {
            for (int j = 0; j < ele[i].length; j++) {
                System.out.print(ele[i][j] + " ");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
