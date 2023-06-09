import java.util.ArrayList;
import java.util.List;

class Solution {
    // Brute force          time- O(n * n * r)
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>() ;
        for (int row = 1; row <= numRows; row++) {
            List<Integer> tempList = new ArrayList<>();
            for (int col = 1; col <= row; col++){
                tempList.add(NcR(row-1, col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }

    public static int NcR (int n, int r) {
        // shortcut for NcR calculations
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);    // numerator
            res = res / (i + 1);    // denominator
        }
        return (int) res;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
