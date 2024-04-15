import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String drink = scan.nextLine();
        String sugar = scan.nextLine();
        int drinksCount = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = (drinksCount * 0.9) * 0.65;
                } else if (sugar.equals("Normal")) {
                    price = drinksCount * 1.0;
                } else if (sugar.equals("Extra")) {
                    price = drinksCount * 1.2;
                }

                if (drinksCount >= 5) {
                    price = price * 0.75;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = (drinksCount * 1.0) * 0.65;
                } else if (sugar.equals("Normal")) {
                    price = drinksCount * 1.2;
                } else if (sugar.equals("Extra")) {
                    price = drinksCount * 1.6;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = (drinksCount * 0.5) * 0.65;
                } else if (sugar.equals("Normal")) {
                    price = drinksCount * 0.6;
                } else if (sugar.equals("Extra")) {
                    price = drinksCount * 0.7;
                }
                break;
        }

        if (price > 15) {
            price = price * 0.8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", drinksCount, drink, price);

    }

}
