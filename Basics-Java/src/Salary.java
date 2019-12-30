import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String tabs = scanner.nextLine();

            if (tabs.equals("Facebook")) {
                salary -= 150;
            } else if (tabs.equals("Instagram")) {
                salary -= 100;
            } else if (tabs.equals("Reddit")) {
                salary -= 50;
            }

            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary > 0) {
            System.out.println(salary);
        }

    }
}