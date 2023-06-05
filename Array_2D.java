public class Array_2D {
    // Q1:- Print the number of 7’s that are in the 2d array.
    public static void CountOf7(int arr[][]){
        int countOf7 = 0;
         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 7){
                    countOf7++;
                }
            }
         }
         System.out.println("count of 7 is : " + countOf7);
    }
    // Q2:- Print out the sum of the numbers in the second row of the “nums” array.
    public static void sumOfMiddle(int num[][]){
        int sum = 0;
        for(int j = 0; j < num[0].length; j++){
            sum = sum + num[1][j];
        }
        System.out.println("sum is : "+ sum);
    }
    // Q3:- Write a program to Find Transpose of a Matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Q1:- 
        // int arr [][] = {{4, 7, 8}, {8, 8, 7}};
        // CountOf7(arr);

        // Q2:-
        // int num[][] = {{1,4,9}, {11,4,3}, {2,2,3}};
        // sumOfMiddle(num);

        // Q3:- 
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };
        // Display original matrix
        printMatrix(matrix);
        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i<row; i++) {
            for (int j = 0; j<column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        // print the transposed matrix
        printMatrix(transpose);
    }
}
