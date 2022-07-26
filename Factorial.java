import java.util.Scanner;

//Factorial Program In Java
public class Factorial {
    public static void main(String[] args) {
        int fact =1;
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        while(num!=0){
            fact = fact*num;
            num--;
        }
        System.out.println(fact);
    }
}
