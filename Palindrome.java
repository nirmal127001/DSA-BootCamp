import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str=in.nextLine();
        String nstr="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            nstr=ch+nstr;
        }
        if(str.equals(nstr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
}