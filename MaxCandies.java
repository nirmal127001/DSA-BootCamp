//https://leetcode.com/problems/kids-with-the-greatest-number-of-candiepublic class MaxCandies
import java.util.ArrayList;
import java.util.List;

public class MaxCandies{
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=0;
        for(int a:candies){
            if(a>max){
                max=a;
            }
        }
        for(int b:candies){
            if(b+extraCandies>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;    
    }
}
