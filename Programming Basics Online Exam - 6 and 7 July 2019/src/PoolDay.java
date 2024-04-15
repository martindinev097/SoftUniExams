import java.util.Scanner;

public class PoolDay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        double priceEntrance = Double.parseDouble(scan.nextLine());
        double priceBed = Double.parseDouble(scan.nextLine());
        double priceUmbrella = Double.parseDouble(scan.nextLine());

        double totalEntranceMoney = priceEntrance * people;
        double totalUmbrellaMoney = priceUmbrella * Math.ceil((people / 2.0));
        double totalBedMoney = priceBed * Math.ceil((people * 0.75));

        double totalSum = totalBedMoney + totalEntranceMoney + totalUmbrellaMoney;

        System.out.printf("%.2f lv.", totalSum);

    }

}