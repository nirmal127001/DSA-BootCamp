//https://leetcode.com/problems/matrix-diagonal-sum/submissions/
public class MatrixDiagSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int length=mat.length;
        int sum=0;
        for(int i=0;i<length;i++){
            sum+=mat[i][i];
        }
        int i=0,j=length-1;
        while(i<length){
            if(i==j){
                i++;
                j--;
                continue;
            }
            sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}

/*
 public int diagonalSum(int[][] mat) {
        int length=mat.length;
        int sum=0;
        int j=length-1;
        for(int i=0;i<length;i++){
            sum+=mat[i][i];
            if(j-i==i){
                continue;
            }
            sum+=mat[j-i][i];
        }
        
        return sum;
    }
 */