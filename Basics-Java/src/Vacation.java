import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoneyForVacation = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int countAllDays = 0;
        int countSpendDays = 0;

        while (availableMoney < neededMoneyForVacation) {

            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            countAllDays++;

            if (action.equals("save")) {
                countSpendDays = 0;
                availableMoney += sum;
            } else if (action.equals("spend")) {
                countSpendDays++;
                availableMoney -= sum;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
            }

            if (countSpendDays == 5) {
                System.out.println("You can't save the money.");
                System.out.println(countAllDays);
                break;
            }

        }

        if (availableMoney >= neededMoneyForVacation) {
            System.out.printf("You saved the money for %d days.", countAllDays);
        }

    }
}