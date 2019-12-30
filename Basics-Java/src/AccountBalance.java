import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        double balance = 0.0;

        while (counter < n) {

            double deposit = Double.parseDouble(scanner.nextLine());

            if (deposit <= 0){
                System.out.println("Invalid operation!");
                break;
            }

            balance += deposit;

            System.out.printf("Increase: %.2f%n", deposit);

            counter++;
        }

        System.out.printf("Total: %.2f%n", balance);
    }
}