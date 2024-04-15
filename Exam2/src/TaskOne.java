import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double averageSpeed = Double.parseDouble(scan.nextLine());
        double fuelNeededPer100Km = Double.parseDouble(scan.nextLine());

        double totalHours = (384400 / averageSpeed) * 2 + 3;
        double fuelNeeded = (384400.0 / 100) * fuelNeededPer100Km * 2;

        System.out.printf("%.0f%n%.0f", Math.ceil(totalHours), fuelNeeded);

    }

}
