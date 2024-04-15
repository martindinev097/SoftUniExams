import java.util.Scanner;

public class Club {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double desiredProfit = Double.parseDouble(scan.nextLine());

        String cocktailName = scan.nextLine();

        double totalEarnings = 0;

        while (!cocktailName.equals("Party!")) {
            int cocktailCount = Integer.parseInt(scan.nextLine());

            double cocktailPrice = cocktailName.length();
            double orderPrice = cocktailPrice * cocktailCount;

            if (orderPrice % 2 != 0) {
                orderPrice = orderPrice * 0.75;
            }

            totalEarnings += orderPrice;

            if (totalEarnings >= desiredProfit) {
                System.out.println("Target acquired.");
                break;
            }

            cocktailName = scan.nextLine();
        }

        if (desiredProfit > totalEarnings) {
            System.out.printf("We need %.2f leva more.%n", desiredProfit - totalEarnings);
        }

        System.out.printf("Club income - %.2f leva.", totalEarnings);

    }

}
