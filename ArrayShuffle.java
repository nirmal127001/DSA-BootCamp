//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i+=2){
            arr[i]=nums[j];
            arr[i+1]=nums[j+n];
            j++;
        }
        return arr;
    }
}
