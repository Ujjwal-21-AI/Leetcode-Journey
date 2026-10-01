import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> current = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    current.add(1);
                } else {
                    current.add(
                        triangle.get(row - 1).get(col - 1)
                        + triangle.get(row - 1).get(col)
                    );
                }
            }
            triangle.add(current);
        }
        return triangle;
    }
}
public class Main {
    public static void main(String[] args) {
        int numRows = 6;
        Solution sol = new Solution();
        System.out.println(sol.generate(numRows));
    }
}