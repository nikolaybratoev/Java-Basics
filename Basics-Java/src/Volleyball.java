import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        int holidaysInWeekEnd = Integer.parseInt(scanner.nextLine());
        int weekendInHomeTown = Integer.parseInt(scanner.nextLine());

        int weekendInYear = 48;
        int weekendInSofia = weekendInYear - weekendInHomeTown;
        double saturdayGames = weekendInSofia * (3.0 / 4);
        double gamesInHolidays = holidaysInWeekEnd * (2.0 / 3);
        double allGames = saturdayGames + gamesInHolidays + weekendInHomeTown;

        if (yearType.equals("leap")) {
            double finalGames = allGames + (allGames * 0.15);
            System.out.printf("%.0f", Math.floor(finalGames));
        } else if (yearType.equals("normal")) {
            System.out.printf("%.0f", Math.floor(allGames));
        }

    }
}