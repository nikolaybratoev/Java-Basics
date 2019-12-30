import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfMovie = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        double ticketPrice = 0;

        if (typeOfMovie.equals("Premiere")) {
            ticketPrice = 12;
        } else if (typeOfMovie.equals("Normal")) {
            ticketPrice = 7.50;
        } else if (typeOfMovie.equals("Discount")) {
            ticketPrice = 5;
        }

        double totalPrice = seats * ticketPrice;

        System.out.printf("%.2f leva", totalPrice);

    }
}