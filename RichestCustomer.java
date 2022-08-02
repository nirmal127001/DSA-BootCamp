import java.util.Arrays;

//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomer {
    public static void main(String[] args) {
        int[][] nums={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(nums));
    }
    static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
