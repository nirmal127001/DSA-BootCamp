import java.util.Scanner;

public class Shape {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        // areaOfCircle();
        // circumferenceOfCircle();
        perimeterOfTriangle();
        // areaOfTriangle();
    }
    static void areaOfCircle(){
        System.out.print("Radius of circle: ");
        double r = in.nextFloat();
        double area =Math.PI*r*r;
        System.out.println(area);
    }
    static void circumferenceOfCircle(){
        System.out.print("Radius of circle: ");
        double r = in.nextFloat();
        double circumference =Math.PI*r*2;
        System.out.println(circumference);
    }
    static void perimeterOfTriangle(){
        System.out.print("Sides: ");
        float s1 = in.nextFloat();
        float s2 = in.nextFloat();
        float s3 = in.nextFloat();
        float perimeter =s1+s2+s3;
        System.out.println(perimeter);
    }
    static void areaOfTriangle(){
        System.out.print("Sides: ");
        float s1 = in.nextFloat();
        float s2 = in.nextFloat();
        float s3 = in.nextFloat();
        float s=(s1+s2+s3)/2;
        float herons=(s*(s-s1)*(s-s2)*(s-s3));
        double area=Math.pow(herons, 0.5);
        System.out.println(area);
    }
}
