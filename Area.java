import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Radius of circle: ");
        double r = in.nextFloat();
        double area =Math.PI*r*r;
        System.out.println(area);
    }
}
