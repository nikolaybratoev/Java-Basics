import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerLitres = Double.parseDouble(scanner.nextLine());
        double wineLitres = Double.parseDouble(scanner.nextLine());
        double rakijaLitres = Double.parseDouble(scanner.nextLine());
        double whiskeyLitres = Double.parseDouble(scanner.nextLine());

        double rakijaPrice = whiskeyPrice - (0.5 * whiskeyPrice);
        double beerPrice = rakijaPrice - (0.8 * rakijaPrice);
        double winePrice = rakijaPrice - (0.4 * rakijaPrice);

        double rakijaFinalPrice = rakijaLitres * rakijaPrice;
        double beerFinalPrice = beerLitres * beerPrice;
        double wineFinalPrice = wineLitres * winePrice;
        double whiskeyFinalPrice = whiskeyLitres * whiskeyPrice;

        double finalPrice = rakijaFinalPrice + beerFinalPrice + whiskeyFinalPrice + wineFinalPrice;

        System.out.printf("%.2f", finalPrice);

    }
}