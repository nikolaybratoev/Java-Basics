import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCake = Integer.parseInt(scanner.nextLine());
        int widthCake = Integer.parseInt(scanner.nextLine());

        int cakeSM = lengthCake * widthCake;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {

            int pieces = Integer.parseInt(input);
            cakeSM -= pieces;

            if (cakeSM <= 0) {
                break;
            }

            input = scanner.nextLine();
        }

        if (cakeSM < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSM));
        } else {
            System.out.printf("%d pieces are left.", cakeSM);
        }

    }
}