package Java1_Practice1;
import java.util.Scanner;

public class areaAndPerimeter {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter radius r: ");
        float r = keyboard.nextFloat();

        double area = PI * Math.pow(r, 2);
        double perimeter = 2 * PI * r;

        System.out.printf("Area is %.2f\n", area);
        System.out.printf("Perimeter is %.2f", perimeter);
    }
}
