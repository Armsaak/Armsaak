import java.util.Scanner;

public class ConvertGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the grade in 100-point scale
        System.out.print("Enter the grade in 100-point scale: ");
        int grade100 = input.nextInt();

        // Convert to 5-point scale
        int grade5;
        if (grade100 >= 90) {
            grade5 = 5;
        } else if (grade100 >= 80) {
            grade5 = 4;
        } else if (grade100 >= 70) {
            grade5 = 3;
        } else if (grade100 >= 60) {
            grade5 = 2;
        } else {
            grade5 = 1;
        }

        // Print the converted grade
        System.out.println("The grade in 5-point scale is: " + grade5);
    }
}
