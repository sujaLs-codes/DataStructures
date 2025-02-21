import java.util.Scanner;

public class Add_of_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many rows you want : ");
        int row = s.nextInt();

        System.out.println("Enter how many columns you want : ");
        int col = s.nextInt();
        int [][] a = new int[row][col];
        int [][] b = new int[row][col];
        int [][] c = new int[row][col];
        int [][] d = new int[row][col];

        System.out.println("Enter the elements for 1st matrix : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements for 2nd matrix : ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the elements for 3rd matrix : ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = s.nextInt();
            }
        }
        System.out.println("The First matrix is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                System.out.print("");
            }
            System.out.println("");
        }
        System.out.println("The Second matrix is : ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
                System.out.print("");
            }
            System.out.println("");
        }
        System.out.println("The Third matrix is : ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
                System.out.print("");
            }
            System.out.println("");
        }
        System.out.println("The Addition of matrix is : ");
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = a[i][j] + b[i][j] + c[i][j];
                System.out.print(d[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
