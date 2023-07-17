import java.util.Scanner;

public class Rotate_Matrix {
    static void Rotate(int[][] A, int r, int c){
        for (int i = 0; i < r; i++)
        {
            for (int j = r - 1; j >= 0; j--) {
                System.out.print(A[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] A= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                A[i][j]= sc.nextInt();
            }
        }
        Rotate(A, row, col);
    }
}
