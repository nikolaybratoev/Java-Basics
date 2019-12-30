import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        switch (symbol) {

            case "+":
                int result = number1 + number2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", number1, number2, result);
                } else {
                    System.out.printf("%d + %d = %d - odd", number1, number2, result);
                }
                break;

            case "-":
                int result2 = number1 - number2;
                if (result2 % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", number1, number2, result2);
                } else {
                    System.out.printf("%d - %d = %d - odd", number1, number2, result2);
                }
                break;

            case "*":
                int result3 = number1 * number2;
                if (result3 % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", number1, number2, result3);
                } else {
                    System.out.printf("%d * %d = %d - odd", number1, number2, result3);
                }
                break;

            case "/":
                if (number1 == 0) {
                    System.out.printf("Cannot divide %d by zero", number2);
                } else if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    double result4 = number1 * 1.0 / number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, result4);
                }
                break;

            case "%":
                if (number1 == 0) {
                    System.out.printf("Cannot divide %d by zero", number2);
                } else if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    double result5 = number1 % number2;
                    System.out.printf("%d %% %d = %.0f", number1, number2, result5);
                }
                break;
        }

    }
}