// WAP to add two matrixes of size 2*3

import java.util.Scanner;

public class arrays_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows of the matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of the matrix : ");
        int cols = sc.nextInt();

        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int [][] additionmatrix = new int[rows][cols];

        System.out.println("Enter the matrix 1 : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the matrix 2 : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                additionmatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The addition of the 2 array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(additionmatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
