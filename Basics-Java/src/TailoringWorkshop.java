import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double areaTableCloths = tables * (length + 2 * 0.30) * (width + 2 * 0.30);
        double squareArea = tables * (length / 2) * (length / 2);

        double priceTablecloth = areaTableCloths * 7 + squareArea * 9;

        double priceInBGN = priceTablecloth * 1.85;

        System.out.printf("%.2f USD%n", priceTablecloth);
        System.out.printf("%.2f BGN", priceInBGN);

    }
}