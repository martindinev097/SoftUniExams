import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double computersCount = Double.parseDouble(scan.nextLine());

        int totalRating = 0;
        double sales = 0;

        for (int i = 1; i <= computersCount; i++) {
            int number = Integer.parseInt(scan.nextLine());

            int rating = number % 10;
            totalRating += number % 10;
            int potentialSales = number / 10;

            if (rating == 3) {
                sales += (potentialSales * 0.5);
            } else if (rating == 4) {
                sales += (potentialSales * 0.7);
            } else if (rating == 5) {
                sales += (potentialSales * 0.85);
            } else if (rating == 6) {
                sales += potentialSales;
            }


        }

        System.out.printf("%.2f%n%.2f", sales, totalRating / computersCount);

    }

}
