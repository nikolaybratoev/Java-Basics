import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 1;
        double sum = 0;
        int elimination = 0;

        while (counter <= 12) {

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4.00) {
                sum += grade;
                counter++;
            } else {
                elimination++;
            }

            if (elimination == 2) {
                break;
            }

        }

        if (elimination > 1) {
            System.out.printf("%s has been excluded at %d grade", name, counter);
        } else {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }

    }
}