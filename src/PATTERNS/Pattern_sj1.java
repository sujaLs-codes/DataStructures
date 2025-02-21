package PATTERNS;

public class Pattern_sj1 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            //for every row ,Run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
