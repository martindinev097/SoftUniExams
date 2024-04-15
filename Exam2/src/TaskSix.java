import java.util.Scanner;

public class TaskSix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int locationsCount = Integer.parseInt(scan.nextLine());

        for (int currentLocation = 1; currentLocation <= locationsCount; currentLocation++) {
            double expectedGold = Double.parseDouble(scan.nextLine());
            int daysToStay = Integer.parseInt(scan.nextLine());
            double goldMined = 0;
            for (int currentDay = 1; currentDay <= daysToStay; currentDay++) {
                double goldMinedCurrentLocation = Double.parseDouble(scan.nextLine());
                goldMined += goldMinedCurrentLocation;

                double averageGoldMined = goldMined / currentDay;

                if (currentDay == daysToStay) {
                    if (averageGoldMined >= expectedGold) {
                        System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldMined);
                    } else {
                        System.out.printf("You need %.2f gold.%n", expectedGold - averageGoldMined);
                    }
                }
            }


        }

    }

}
