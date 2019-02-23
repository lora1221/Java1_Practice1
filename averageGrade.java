package Java1_Practice1;
import java.util.Scanner;

public class averageGrade {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Physics grade: ");
        float physics = keyboard.nextFloat();
        System.out.print("Enter Chemistry grade: ");
        float chemistry = keyboard.nextFloat();
        System.out.print("Enter Biology grade: ");
        float bio = keyboard.nextFloat();

        // calculate sum and average
        float sum = physics + chemistry + bio;
        float average = sum / 3;

        System.out.println("Sum of grades is: " + sum);
        System.out.printf("Average grade is: %.2f", average);

        keyboard.close();
    }
}
