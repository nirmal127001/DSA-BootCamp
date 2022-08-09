//https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
       
    }

    static int largestAltitude(int[] gain) {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int maxAlt=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>maxAlt){
                maxAlt=arr[j];
            }
        }
        return maxAlt;
    }
}
