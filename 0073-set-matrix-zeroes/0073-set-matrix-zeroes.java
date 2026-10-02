import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;

        if(rows == 0){
            return;
        }

        int cols = matrix[0].length;
        int[][] original = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                original[i][j] = matrix[i][j];
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(original[i][j] == 0){
                    for(int c=0; c<cols; c++){
                        matrix[i][c] = 0;
                    }
                    for(int r=0; r<rows; r++){
                        matrix[r][j] = 0;
                    }
                }
            }
        }
    }
}