import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/submissions/

public class Transpose {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newMatrix=transpose(mat) ;
        for(int[] i:newMatrix){
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] newMatrix=new int[matrix[0].length][matrix.length];
        for(int i=0;i<newMatrix.length;i++){
            for(int j=0;j<newMatrix[i].length;j++){
                newMatrix[i][j]=matrix[j][i];
            }
        }
        return newMatrix;
    }
}
