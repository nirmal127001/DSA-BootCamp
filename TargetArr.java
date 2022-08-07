import java.util.ArrayList;

//https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/

public class TargetArr{
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4}, index={0,1,2,2,1};
        System.out.println(createTargetArray(nums, index));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            target[i]=list.get(i);
        }
        return target;
    }
}