public class ThreeD_Arr {
    public static void main(String[] args) {

        int myArr[][][] = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    myArr[i][j][k] = i * j * k;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(myArr[i][j][k] + " ");
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }
}
