public class AddArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        String ns="";
        for(int i:nums){
            String s = String.valueOf(i);
            ns+=s;
        }
        System.out.println(ns);
    }
}
