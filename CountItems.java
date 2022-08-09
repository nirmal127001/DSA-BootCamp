import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/
public class CountItems {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(0).equals(ruleValue)){
                    count++;
            }
            if(items.get(i).get(1).equals(ruleValue)){
                count++;
            }
            if(items.get(i).get(2).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
