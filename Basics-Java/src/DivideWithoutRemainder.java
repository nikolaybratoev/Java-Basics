import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countDivideBy2 = 0;
        int countDivideBy3 = 0;
        int countDivideBy4 = 0;

        for (int i = 1; i <= n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                countDivideBy2++;
            }
            if (number % 3 == 0) {
                countDivideBy3++;
            }
            if (number % 4 == 0) {
                countDivideBy4++;
            }

        }

        double percentDivideBy2 = (countDivideBy2 * 1.0 / n) * 100;
        double percentDivideBy3 = (countDivideBy3 * 1.0 / n) * 100;
        double percentDivideBy4 = (countDivideBy4 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", percentDivideBy2);
        System.out.printf("%.2f%%%n", percentDivideBy3);
        System.out.printf("%.2f%%%n", percentDivideBy4);

    }
}