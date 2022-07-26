import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class Factors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
