import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        double sum = 0;

        if (room.equals("room for one person")) {

            days = days - 1;
            sum = days * 18;

            if (grade.equals("positive")) {
                sum = (sum * 0.25) + sum;
            } else if (grade.equals("negative")) {
                sum = sum - (sum / 0.80);
            }

        } else if (room.equals("apartment")) {
            days -= 1;
            sum = days * 25;

            if (days < 10) {
                sum = sum - (sum * 0.30);
            } else if (days > 10 && days <= 15) {
                sum = sum - (sum * 0.35);
            } else if (days > 15) {
                sum = sum - (sum * 0.50);
            }

            if (grade.equals("positive")) {
                sum = (sum * 0.25) + sum;
            } else if (grade.equals("negative")) {
                sum = sum - (sum / 0.80);
            }

        } else if (room.equals("president apartment")) {
            days -= 1;
            sum = days * 35;

            if (days < 10) {
                sum = sum - (sum * 0.10);
            } else if (days > 10 && days <= 15) {
                sum = sum - (sum * 0.15);
            } else if (days > 15) {
                sum = sum - (sum * 0.20);
            }

            if (grade.equals("positive")) {
                sum = (sum * 0.25) + sum;
            } else if (grade.equals("negative")) {
                sum = sum - (sum * 0.10);
            }

        }

        System.out.printf("%.2f", sum);

    }
}