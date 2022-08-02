import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        for(int i=0;i<arr.length;i++){
            if(i>n-1)
                arr[i]=nums[i-n];
            else
                arr[i]=nums[i];
        }
        return arr;
    }
}
