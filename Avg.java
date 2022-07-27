import java.util.Scanner;

//Calculate Average Of N Numbers
public class Avg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Value of n:");
        int n = in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print("Number: ");
            int num = in.nextInt();
            sum+=num;
        }
        System.out.println(sum/n);
    }
}
