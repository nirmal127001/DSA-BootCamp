import java.util.Scanner;

//Java Program Vowel Or Consonant
public class IsVowel {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner in = new Scanner(System.in);
        char ch =in.next().trim().charAt(0);
        if((int)ch==97 || (int)ch==101 || (int)ch==105 || (int)ch==111 || (int)ch==117 || (int)ch==65 || (int)ch==69 || (int)ch==73 || (int)ch==79 || (int)ch==85){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
