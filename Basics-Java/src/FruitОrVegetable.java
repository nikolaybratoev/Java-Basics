import java.util.Scanner;

public class FruitОrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfProduct = scanner.nextLine().toLowerCase();

        if (nameOfProduct.equals("banana") || nameOfProduct.equals("apple") || nameOfProduct.equals("kiwi")
                || nameOfProduct.equals("cherry") || nameOfProduct.equals("lemon") || nameOfProduct.equals("grapes")) {

            System.out.println("fruit");

        } else if (nameOfProduct.equals("tomato") || nameOfProduct.equals("cucumber") || nameOfProduct.equals("pepper")
                || nameOfProduct.equals("carrot")) {

            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}