import java.util.Scanner;

//future value=present valuex(1+interest)to power compounding period
//fv=pv(1+i)to power n
public class FutureValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pv=in.nextFloat();
        float i=in.nextFloat();
        int n=in.nextInt();
        double fv=pv*(Math.pow((1+i),n));
        System.out.println(fv);
    }
}
