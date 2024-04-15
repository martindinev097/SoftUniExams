import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int foodLeft = Integer.parseInt(scan.nextLine());
        double foodDeer1 = Double.parseDouble(scan.nextLine());
        double foodDeer2 = Double.parseDouble(scan.nextLine());
        double foodDeer3 = Double.parseDouble(scan.nextLine());

        double totalFoodNeeded = days * (foodDeer1 + foodDeer2 + foodDeer3);

        if (foodLeft >= totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodLeft - totalFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodNeeded - foodLeft));
        }

    }

}
