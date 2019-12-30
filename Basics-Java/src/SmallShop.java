import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (town.equals("sofia")) {

            if (product.equals("coffee")) {
                price = quantity * 0.5;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = quantity * 0.8;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = quantity * 1.2;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = quantity * 1.45;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = quantity * 1.6;
                System.out.println(price);
            }

        }

        if (town.equals("plovdiv")) {

            if (product.equals("coffee")) {
                price = quantity * 0.4;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = quantity * 0.7;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = quantity * 1.15;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = quantity * 1.3;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = quantity * 1.5;
                System.out.println(price);
            }

        }

        if (town.equals("varna")) {

            if (product.equals("coffee")) {
                price = quantity * 0.45;
                System.out.println(price);
            } else if (product.equals("water")) {
                price = quantity * 0.7;
                System.out.println(price);
            } else if (product.equals("beer")) {
                price = quantity * 1.1;
                System.out.println(price);
            } else if (product.equals("sweets")) {
                price = quantity * 1.35;
                System.out.println(price);
            } else if (product.equals("peanuts")) {
                price = quantity * 1.55;
                System.out.println(price);
            }
        }
    }
}