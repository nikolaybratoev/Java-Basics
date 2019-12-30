import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceOfFlower = 0;

        switch (typeOfFlowers) {

            case "Roses":
                priceOfFlower = 5;
                break;

            case "Dahlias":
                priceOfFlower = 3.80;
                break;

            case "Tulips":
                priceOfFlower = 2.80;
                break;

            case "Narcissus":
                priceOfFlower = 3;
                break;

            case "Gladiolus":
                priceOfFlower = 2.50;
                break;
        }

        double totalPrice = countFlowers * priceOfFlower;

        if (countFlowers > 80 && typeOfFlowers.equals("Roses")) {
            totalPrice = totalPrice - 0.10 * totalPrice;
        } else if (countFlowers > 90 && typeOfFlowers.equals("Dahlias")) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        } else if (countFlowers > 80 && typeOfFlowers.equals("Tulips")) {
            totalPrice = totalPrice - 0.15 * totalPrice;
        } else if (countFlowers < 120 && typeOfFlowers.equals("Narcissus")) {
            totalPrice = totalPrice + 0.15 * totalPrice;
        } else if (countFlowers < 80 && typeOfFlowers.equals("Gladiolus")) {
            totalPrice = totalPrice + 0.20 * totalPrice;
        }

        if (budget >= totalPrice) {
            double left = budget - totalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, typeOfFlowers, left);
        } else {
            double needMoney = totalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        }

    }
}