import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int matrix[][] = new int[row][col];

        // // Taking input
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // // Output
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(matrix[i][j]+ " ");
        //     }
        //     System.out.println(" ");
        // }





        // Searching for an element x in a matrix.
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int searchX = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        // Taking Inputs
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        // searching element in the matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(searchX == matrix[i][j]){
                    System.out.print(i+" "+j);
                }
            }
        }

        sc.close();
    }
}
