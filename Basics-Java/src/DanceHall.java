import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double wardrobe = Double.parseDouble(scanner.nextLine());

        double areaHallCentimeters = (length * 100) * (width * 100);
        double wardrobeAreaCentimeters = (wardrobe * 100) * (wardrobe * 100);
        double blenchArea = areaHallCentimeters / 10;
        double freeSpace = areaHallCentimeters - wardrobeAreaCentimeters - blenchArea;
        double dancers = freeSpace / (40 + 7000);

        System.out.printf("%.0f", Math.floor(dancers));

    }
}