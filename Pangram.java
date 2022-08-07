import java.util.ArrayList;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class Pangram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        //String sentence="nirmal";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        ArrayList<Character> list=new ArrayList<>();
        for(char i:sentence.toCharArray()){
            if(list.contains(i)){
                continue;
            }
            else{
                list.add(i);
            }
        }
        return list.size()==26;
        
    }
}
