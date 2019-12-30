import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equalsIgnoreCase("End")) {

            double minBudget = Double.parseDouble(scanner.nextLine());
            double moneySave = 0;

            while (moneySave < minBudget) {
                moneySave += Double.parseDouble(scanner.nextLine());
            }

            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }

    }
}