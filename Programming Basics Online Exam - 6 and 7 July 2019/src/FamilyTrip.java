import java.util.Scanner;

public class FamilyTrip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double pricePerNight = Double.parseDouble(scan.nextLine());
        int percentForExpenses = Integer.parseInt(scan.nextLine());

        double moneyForExpenses = budget * (percentForExpenses / 100.0);
        double priceForStay = nights * pricePerNight;

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
            priceForStay = nights * pricePerNight;
        }

        double totalExpenses = priceForStay + moneyForExpenses;

        if (budget >= totalExpenses) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalExpenses);
        } else {
            System.out.printf("%.2f leva needed.", totalExpenses - budget);
        }

    }

}
