import java.util.Scanner;

public class AgencyProfit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int adultTicketsCount = Integer.parseInt(scan.nextLine());
        int kidTicketsCount = Integer.parseInt(scan.nextLine());
        double adultTicketPrice = Double.parseDouble(scan.nextLine());
        double adminFee = Double.parseDouble(scan.nextLine());

        double kidTicketPrice = adultTicketPrice * 0.3;

        double totalSum = adultTicketsCount * (adultTicketPrice + adminFee) + kidTicketsCount * (kidTicketPrice + adminFee);

        double profit = totalSum * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);
    }

}