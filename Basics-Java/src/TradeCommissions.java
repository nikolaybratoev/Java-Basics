import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine().toLowerCase();
        double sells = Double.parseDouble(scanner.nextLine());

        double commission = -1;

        if (city.equals("sofia")) {

            if (sells >= 0 && sells <= 500) {
                commission = sells * 0.05;
            } else if (sells > 500 && sells <= 1000) {
                commission = sells * 0.07;
            } else if (sells > 1000 && sells <= 10000) {
                commission = sells * 0.08;
            } else if (sells > 10000) {
                commission = sells * 0.12;
            }

        }

        if (city.equals("varna")) {

            if (sells >= 0 && sells <= 500) {
                commission = sells * 0.045;
            } else if (sells > 500 && sells <= 1000) {
                commission = sells * 0.075;
            } else if (sells > 1000 && sells <= 10000) {
                commission = sells * 0.10;
            } else if (sells > 10000) {
                commission = sells * 0.13;
            }

        }

        if (city.equals("plovdiv")) {

            if (sells >= 0 && sells <= 500) {
                commission = sells * 0.055;
            } else if (sells > 500 && sells <= 1000) {
                commission = sells * 0.08;
            } else if (sells > 1000 && sells <= 10000) {
                commission = sells * 0.12;
            } else if (sells > 10000) {
                commission = sells * 0.145;
            }

        }

        if (commission > 0) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }

    }
}