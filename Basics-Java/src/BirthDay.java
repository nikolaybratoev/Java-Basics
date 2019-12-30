import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double aquariumLitres = volume * 0.001;
        double aquariumPercent = percent * 0.01;
        double finalLitres = aquariumLitres * (1 - aquariumPercent);

        System.out.printf("%.3f", finalLitres);

    }
}