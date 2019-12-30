import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxCombination = 0;
        String winner = "";
        int currentSum = 0;

        while (!input.equals("STOP")) {

            currentSum = 0;
            for (int i = 0; i < input.length(); i++) {
                currentSum += (int) (input.charAt(i));
            }

            if (currentSum > maxCombination) {
                maxCombination = currentSum;
                winner = input;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Winner is %s - %d!", winner, maxCombination);

    }
}