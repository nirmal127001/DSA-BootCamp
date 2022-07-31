import java.util.Scanner;

//Area and circumference of a circle given radius
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Radius: ");
        float r= in.nextFloat();
        System.out.println("Area: "+area(r));
        System.out.print("Circumference: "+circumference(r));
    }
    static float area(float r) {
        return 3.14f*(r*r);
    }
    static float circumference(float r) {
        return 2*3.14f*r;
    }
}
