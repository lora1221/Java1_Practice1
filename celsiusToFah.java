package Java1_Practice1;
import java.util.Scanner;

public class celsiusToFah {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        float c = keyboard.nextFloat();

        float f = c / 5 * 9 + 32;
        System.out.printf("%.2f Celsius = %.2f Fahrenheit", c, f);
    }
}
