import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Point from: ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print("Point to: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        double distance = Math.pow(((x1-x)*(x1-x)+(y1-y)*(y1-y)),0.5);
        System.out.println(distance);
    }
}
