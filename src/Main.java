import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for date of birth
        System.out.print("Enter your birth year (e.g., 2000): ");
        int year = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        // Get today's date
        LocalDate today = LocalDate.now();
        LocalDate birthDate;

        try {
            birthDate = LocalDate.of(year, month, day);

            // Calculate age
            Period age = Period.between(birthDate, today);

            if (age.isNegative()) {
                System.out.println("Birth date is in the future. Please check again!");
            } else {
                System.out.println("Your age is: " + age.getYears() + " years, "
                        + age.getMonths() + " months, and "
                        + age.getDays() + " days.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date entered. Please try again.");
        }

        scanner.close();
    }
}
