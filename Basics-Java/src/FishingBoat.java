import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {

            case "Spring":
                price = price + 3000;
                if (fisherman <= 6) {
                    price = price - (price * 0.10);
                } else if (fisherman > 7 && fisherman <= 11) {
                    price = price - (price * 0.15);
                } else if (fisherman >= 12) {
                    price = price - (price * 0.25);
                }
                break;

            case "Summer":
                price = price + 4200;
                if (fisherman <= 6) {
                    price = price - (price * 0.10);
                } else if (fisherman > 7 && fisherman <= 11) {
                    price = price - (price * 0.15);
                } else if (fisherman >= 12) {
                    price = price - (price * 0.25);
                }
                break;

            case "Autumn":
                price = price + 4200;
                if (fisherman <= 6) {
                    price = price - (price * 0.10);
                } else if (fisherman > 7 && fisherman <= 11) {
                    price = price - (price * 0.15);
                } else if (fisherman >= 12) {
                    price = price - (price * 0.25);
                }
                break;

            case "Winter":
                price = price + 2600;
                if (fisherman <= 6) {
                    price = price - (price * 0.10);
                } else if (fisherman > 7 && fisherman <= 11) {
                    price = price - (price * 0.15);
                } else if (fisherman >= 12) {
                    price = price - (price * 0.25);
                }
                break;

        }

        if (fisherman % 2 == 0 && (!season.equals("Autumn"))) {
            price = price - (price * 0.95);
        }

        if (budget >= price) {
            double finalPrice = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", finalPrice);
        } else {
            double needMoney = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", needMoney);
        }

    }
}