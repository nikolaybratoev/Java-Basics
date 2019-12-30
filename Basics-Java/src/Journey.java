import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double finalSum = 0;
        String hotel = "";
        String camp = "";
        String bulgaria = "";
        String balkans = "";
        String europe = "";

        switch (season) {

            case "summer":
                if (budget <= 100) {
                    finalSum = budget - (budget * 0.30);
                    camp = "Camp";
                    bulgaria = "Bulgaria";
                } else if (budget <= 1000) {
                    finalSum = budget - (budget * 0.40);
                    camp = "Camp";
                    balkans = "Balkans";
                } else {
                    finalSum = budget - (budget * 0.90);
                    europe = "Europe";
                    hotel = "Hotel";
                }
                break;

            case "winter":
                if (budget <= 100) {
                    finalSum = budget - (budget * 0.70);
                    hotel = "Hotel";
                    bulgaria = "Bulgaria";
                } else if (budget <= 1000) {
                    finalSum = budget - (budget * 0.80);
                    hotel = "Hotel";
                    balkans = "Balkans";
                } else {
                    finalSum = budget - (budget * 0.90);
                    hotel = "Hotel";
                    europe = "Europe";
                }
                break;
        }

        if (season.equals("summer")) {

            if (budget <= 100) {
                double finalBudget = budget - finalSum;
                System.out.printf("Somewhere in %s%n", bulgaria);
                System.out.printf("%s - %.2f", camp, finalBudget);
            } else if (budget <= 1000) {
                double finalBudget = budget - finalSum;
                System.out.printf("Somewhere in %s%n", balkans);
                System.out.printf("%s - %.2f", camp, finalBudget);
            } else {
                double finalBudget = budget - finalSum;
                System.out.printf("Somewhere in %s%n", europe);
                System.out.printf("%s - %.2f", hotel, finalBudget);
            }

        } else if (season.equals("winter")) {

            if (budget <= 100) {
                double finalBudget = budget - finalSum;
                System.out.printf("Somewhere in %s%n", bulgaria);
                System.out.printf("%s - %.2f", hotel, finalBudget);
            } else if (budget <= 1000) {
                double finalBudget = budget - finalSum;
                System.out.printf("Somewhere in %s%n", balkans);
                System.out.printf("%s - %.2f", hotel, finalBudget);
            } else {
                double finalBudget = budget - finalSum;
                System.out.printf("Somewhere in %s%n", europe);
                System.out.printf("%s - %.2f", hotel, finalBudget);
            }

        } else {
            double finalBudget = budget - finalSum;
            System.out.printf("Somewhere in %s%n", europe);
            System.out.printf("%s - %.2f", hotel, finalBudget);
        }

    }
}