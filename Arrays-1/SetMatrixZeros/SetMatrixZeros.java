import java.util.Arrays;

class SolutionBrute {
    // Brute force
    public static void setZeros(int arr[][]) {
       int n = arr.length;
       for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++) {
            if(arr[i][j] == 0){
                markRow(i, arr);     
            // markRow() marks the row elements except the zero as -1 / set the ones to -1
                markCol(j, arr);     
            // markCol() marks the column elements except the zero as -1
            }
        }
       }

       for (int i = 0; i < n; i++){
        for (int j = 0; j < n; j++) {
            if(arr[i][j] == -1){
                arr[i][j] = 0;
            }
        }
    }


    }

    public static void markRow(int i, int arr[][]) {
       
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]!=0){
                    arr[i][j] = -1;
                }
            }
        
    }

    public static void markCol(int j, int arr[][]) {
       
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][j]!=0){
                arr[i][j] = -1;
            }
        }
    
}

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,0,1}};
        System.out.println(Arrays.deepToString(arr));
        setZeros(arr);
        System.out.println(Arrays.deepToString(arr));
    }

}