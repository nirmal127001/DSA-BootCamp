import java.util.Scanner;

//Compound Interest Java Program
public class Compound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Principal: ");
        float principal = in.nextFloat();
        System.out.print("Rate: ");
        float rate=in.nextFloat();
        System.out.print("Duration(t) in months: ");
        int time = in.nextInt();
        time=time/12;
        float totalAmount=principal*((float)Math.pow((1+rate/100),time));
        System.out.println(totalAmount-principal);
    }
}
