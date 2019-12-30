import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorsCount = Integer.parseInt(scanner.nextLine());
        int aptCount = Integer.parseInt(scanner.nextLine());

        for (int floor = floorsCount; floor >= 1; floor--) {

            for (int aptNum = 0; aptNum < aptCount; aptNum++) {

                if (floor == floorsCount) {
                    System.out.print("L" + floor + aptNum + " ");
                } else if (floor % 2 == 0) {
                    System.out.print("O" + floor + aptNum + " ");
                } else {
                    System.out.print("A" + floor + aptNum + " ");
                }

            }

            System.out.println();
        }

    }
}