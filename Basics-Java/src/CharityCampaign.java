import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCampaign = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double sumForCakes = cakes * 45;
        double sumForWaffles = waffles * 5.80;
        double sumForPancakes = pancakes * 3.20;

        double sumForDay = (sumForCakes + sumForWaffles + sumForPancakes) * bakers;
        double sumForCampaign = sumForDay * daysCampaign;

        double finalProfit = sumForCampaign * 7/8;

        System.out.printf("%.2f", finalProfit);

    }
}