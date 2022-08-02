import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/
public class ArrayBuild{
    public static void main(String[] args){
        int[] nums = {0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums) {
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[nums[i]];
        }
        return temp;
    }
}