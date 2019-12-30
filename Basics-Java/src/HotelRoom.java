import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        switch (month) {

            case "May":
                if (nights > 14) {
                    double priceForNightStudio = 50 - (50 * 0.30);
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightApartment = 65 - (65 * 0.10);
                    double priceForNightsApartment = priceForNightApartment * nights;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                } else if (nights >= 7) {
                    double priceForNightStudio = 50 - (50 * 0.05);
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightsApartment = nights * 65;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                }
                break;

            case "June":
                if (nights > 14) {
                    double priceForNightStudio = 75.20 - (75.20 * 0.20);
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightApartment = 68.70 - (68.70 * 0.10);
                    double priceForNightsApartment = priceForNightApartment * nights;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                } else if (nights > 7) {
                    double priceForNightStudio = 75.20 * nights;
                    double priceForNightsApartment = nights * 68.70;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightStudio);
                }
                break;

            case "July":
                if (nights > 14) {
                    double priceForNightStudio = 76;
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightApartment = 77 - (77 * 0.10);
                    double priceForNightsApartment = priceForNightApartment * nights;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                } else if (nights > 7) {
                    double priceForNightStudio = 76 * nights;
                    double priceForNightsApartment = nights * 77;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightStudio);
                }
                break;

            case "August":
                if (nights > 14) {
                    double priceForNightStudio = 76;
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightApartment = 77 - (77 * 0.10);
                    double priceForNightsApartment = priceForNightApartment * nights;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                } else if (nights > 7) {
                    double priceForNightStudio = 76 * nights;
                    double priceForNightsApartment = nights * 77;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightStudio);
                }
                break;

            case "September":
                if (nights > 14) {
                    double priceForNightStudio = 75.20 - (75.20 * 0.20);
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightApartment = 68.70 - (68.70 * 0.10);
                    double priceForNightsApartment = priceForNightApartment * nights;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                } else if (nights > 7) {
                    double priceForNightStudio = 75.20 * nights;
                    double priceForNightsApartment = nights * 68.70;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightStudio);
                }
                break;

            case "October":
                if (nights >= 14) {
                    double priceForNightStudio = 50 - (50 * 0.30);
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightApartment = 65 - (65 * 0.10);
                    double priceForNightsApartment = priceForNightApartment * nights;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                } else if (nights >= 7) {
                    double priceForNightStudio = 50 - (50 * 0.05);
                    double priceForNightsStudio = priceForNightStudio * nights;
                    double priceForNightsApartment = nights * 65;
                    System.out.printf("Apartment: %.2f lv.%n", priceForNightsApartment);
                    System.out.printf("Studio: %.2f lv.", priceForNightsStudio);
                }
                break;
        }

    }
}