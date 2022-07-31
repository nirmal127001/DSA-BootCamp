import java.util.Scanner;

//If a person is eligible to vote
public class IfEligible{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(ifEligible(age));
    }

    static boolean ifEligible(int age) {
        return age>=18;
    }
    
}