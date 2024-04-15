import java.util.Scanner;

public class AddBags {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double price20Kg = Double.parseDouble(scan.nextLine());
        double luggageKg = Double.parseDouble(scan.nextLine());
        int daysUntilGo = Integer.parseInt(scan.nextLine());
        int luggageCount = Integer.parseInt(scan.nextLine());

        double price = 0;

        if (luggageKg < 10) {
            price = price20Kg * 0.2;
        } else if (luggageKg <= 20) {
            price = price20Kg * 0.5;
        } else {
            price = price20Kg;
        }

        if (daysUntilGo > 30) {
            price = price * 1.1 * luggageCount;
        } else if (daysUntilGo >= 7) {
            price = price * 1.15 * luggageCount;
        } else {
            price = price * 1.4 * luggageCount;
        }

        System.out.printf("The total price of bags is: %.2f lv. ", price);

    }

}
