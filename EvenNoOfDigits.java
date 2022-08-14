public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            String s = String.valueOf(i);
            if(s.length()%2==0){
                count++;
            }
        }
        return count;
        
    }
}
