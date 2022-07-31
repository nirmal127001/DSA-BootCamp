import java.util.Scanner;

//if a triplet is pythogorean i.e.,sum of square of two number is equal to the square of third
public class IsPythogorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(isPythogorean(a, b, c));
    }

    static boolean isPythogorean(int a, int b, int c) {
        boolean result = false;
        if(a*a+b*b==c*c)
            result= true;
        if(a*a==b*b+c*c)
            result= true;
        if(a*a+c*c==b*b)
            result= true;
        return result;
    }
}
