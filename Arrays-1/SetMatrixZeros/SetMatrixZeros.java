// https://leetcode.com/problems/set-matrix-zeroes/
import java.util.Arrays;

class Solution {
    // best                time-O(nxM)      space-O(1)
    public static void setZeroes(int[][] arr) {
        int col0 = 1;
        int rows = arr.length;
        int cols = arr[0].length;
        
        // use first row and first column to mark which row/columns will be zero
        for(int i = 0; i < rows; i++){
            if(arr[i][0]==0) col0 = 0;
            for (int j = 1; j < cols; j++) {
                if(arr[i][j] == 0){
                    arr[i][0]=arr[0][j]=0;
                }
            }
        }

        // traverse the matrix in reverse order and make rows and cols marked zero to zero
        for(int i = rows - 1; i >= 0; i--){
            for(int j = cols - 1; j >= 1; j--){
                if(arr[i][0]==0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
                if(col0 == 0) arr[i][0] = 0;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,0,1}};
        System.out.println(Arrays.deepToString(arr));
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}

// optimal
class SolutionOptimal {
    // complexity                time-O(mXn)          space-(m+n)
    public static void setZeroesOptimal(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int[] col = new int[m];
        int[] row = new int[n];

        // mark the rows and columns to be made zero
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // re iterate to convert the marked rows and columns to zero
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(col[j] == 1 || row[i] == 1){
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,0,1}};
        System.out.println(Arrays.deepToString(arr));
        setZeroesOptimal(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}

// class SolutionBrute {
//     // Brute force
//     public static void setZerosBrute(int arr[][]) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++){
//         for (int j = 0; j < n; j++) {
//             if(arr[i][j] == 0){
//                 markRow(i, arr);     
//             // markRow() marks the row elements except the zero as -1 / set the ones to -1
//                 markCol(j, arr);     
//             // markCol() marks the column elements except the zero as -1
//             }
//         }
//        }

//        for (int i = 0; i < n; i++){
//         for (int j = 0; j < n; j++) {
//             if(arr[i][j] == -1){
//                 arr[i][j] = 0;
//             }
//         }
//     }


//     }

//     public static void markRow(int i, int arr[][]) {
       
//             for (int j = 0; j < arr.length; j++) {
//                 if(arr[i][j]!=0){
//                     arr[i][j] = -1;
//                 }
//             }
        
//     }

//     public static void markCol(int j, int arr[][]) {
       
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i][j]!=0){
//                 arr[i][j] = -1;
//             }
//         }
    
// }

//     public static void main(String[] args) {
//         int[][] arr = {{1,1,1},{1,0,1},{1,0,1}};
//         System.out.println(Arrays.deepToString(arr));
//         setZerosBrute(arr);
//         System.out.println(Arrays.deepToString(arr));
//     }

// }