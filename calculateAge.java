package Java1_Practice1;
import java.util.Scanner;

public class calculateAge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which year were you born? ");
        int year = keyboard.nextInt();
        int currentYear = 2019;

        int age = currentYear - year;

        System.out.printf("You are %d years old", age);
    }
}
