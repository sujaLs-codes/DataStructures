
public class Spiral_Matrix {

    public static void printSpiral(int matrix[][]){
        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.length-1;
        int end_column = matrix.length-1;

        while(start_row <= end_row && start_col <= end_column)
        {
            //top
            for (int j = start_col; j <= end_column; j++) {
                System.out.print(matrix[start_col][j] + " ");
            }

            //right
            for(int i = start_row+1; i <= end_row; i++){
                System.out.print(matrix[i] [end_column] + " ");
            }

            //bottom
            for (int i = 0; i <= start_col; i--) {
                if(start_row == end_row){
                    break;
                }
                System.out.print(matrix[i][start_col] + " ");
            }

            //left
            for (int i = 0; i < start_row; i--) {
                if(start_col == end_column){
                    break;
                }
                System.out.print(matrix[i][start_col] + " ");
            }

            start_col++;
            start_row++;
            end_column--;
            end_row--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        printSpiral(matrix);
    }
}

