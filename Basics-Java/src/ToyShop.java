import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sumForOrder = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);

        int toys = puzzles + dolls + bears + minions + trucks;

        double discount = 0;

        if (toys >= 50) {
            discount = sumForOrder * 0.25;
        }

        double finalSum = sumForOrder - discount;
        finalSum = finalSum - (finalSum * 0.10);

        if (finalSum >= vacation) {
            System.out.printf("Yes! %.2f lv left.", finalSum - vacation);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(finalSum - vacation));
        }

    }
}