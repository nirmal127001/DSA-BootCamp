import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerNoCount {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j:nums){
                if(j<nums[i]){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}
