import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int foodKg = Integer.parseInt(scan.nextLine());
        int foodInGrams = foodKg * 1000;

        String command = scan.nextLine();

        int foodEaten = 0;

        while (!command.equals("Adopted")) {
            int foodEatenGrams = Integer.parseInt(command);

            foodEaten += foodEatenGrams;

            command = scan.nextLine();
        }

        if (foodEaten > foodInGrams) {
            System.out.printf("Food is not enough. You need %d grams more.", foodEaten - foodInGrams);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - foodEaten);
        }
    }

}
