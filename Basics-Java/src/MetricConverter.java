import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inputMetric = scanner.nextLine();
        String outputMetric2 = scanner.nextLine();

        if (inputMetric.equals("mm")) {
            number /= 1000;
        } else if (inputMetric.equals("cm")) {
            number /= 100;
        }

        if (outputMetric2.equals("mm")) {
            number *= 1000;
        } else if (outputMetric2.equals("cm")) {
            number *= 100;
        }

        System.out.printf("%.3f", number);

    }
}