import java.util.ArrayList;

public class Array_BUG {
    public static void main(String[] args){
        Solution s = new Solution();
        ArrayList<ArrayList<Integer>> res = s.generateMatrix(3);
        System.out.println(res.toString());
    }

    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get(i + B));
        }
        return ret;
    }
}
 class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        int[][] arr = new int[A][A];

        int total_elements = A*A;
        int i = 1;

        int row_min, row_max, col_min, col_max, curr_row, curr_col;
        row_min = col_min = curr_row = curr_col = 0;
        row_max = col_max = A-1;

        while(total_elements>0){
            while(curr_col < col_max && total_elements > 0){
                arr[curr_row][curr_col] = i;
                // res.get(curr_row).set(curr_col, i);
                i++; total_elements--;
                curr_col++;
            }row_min++;
            while(curr_row < row_max && total_elements > 0){
                arr[curr_row][curr_col] = i;
                i++; total_elements--;
                curr_row++;
            }col_max--;
            while(curr_col > col_min && total_elements > 0){
                arr[curr_row][curr_col] = i;
                i++; total_elements--;
                curr_col--;
            }row_max--;
            while(curr_row > row_min && total_elements > 0){
                arr[curr_row][curr_col] = i;
                i++; total_elements--;
                curr_row--;
            }col_min++;
        }
System.out.println(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int it = 0; it< A; it++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j< A; j++){
                list.add(arr[it][j]);
            }
            res.add(list);
        }
        return res;
    }
}
