import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        boolean isValidFruit = true;
        boolean isValidDay = true;
        double price = 0;

        if ("Monday".equals(weekDay) || "Tuesday".equals(weekDay) || "Wednesday".equals(weekDay) ||
                "Thursday".equals(weekDay) || "Friday".equals(weekDay)) {

            if ("banana".equals(fruit)) {
                price = 2.50;
            } else if ("apple".equals(fruit)) {
                price = 1.20;
            } else if ("orange".equals(fruit)) {
                price = 0.85;
            } else if ("grapefruit".equals(fruit)) {
                price = 1.45;
            } else if ("kiwi".equals(fruit)) {
                price = 2.70;
            } else if ("pineapple".equals(fruit)) {
                price = 5.50;
            } else if ("grapes".equals(fruit)) {
                price = 3.85;
            } else {
                isValidFruit = false;
            }

        } else if ("Saturday".equals(weekDay) || "Sunday".equals(weekDay)) {

            if ("banana".equals(fruit)) {
                price = 2.70;
            } else if ("apple".equals(fruit)) {
                price = 1.25;
            } else if ("orange".equals(fruit)) {
                price = 0.90;
            } else if ("grapefruit".equals(fruit)) {
                price = 1.60;
            } else if ("kiwi".equals(fruit)) {
                price = 3.00;
            } else if ("pineapple".equals(fruit)) {
                price = 5.60;
            } else if ("grapes".equals(fruit)) {
                price = 4.20;
            } else {
                isValidFruit = false;
            }

        } else {
            isValidDay = false;
        }

        if (!isValidFruit || !isValidDay) {
            System.out.println("error");
        } else {
            price *= quantity;
            System.out.printf("%.2f", price);
        }

    }
}