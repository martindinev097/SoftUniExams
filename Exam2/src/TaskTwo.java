import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int processorCount = Integer.parseInt(scan.nextLine());
        int employees = Integer.parseInt(scan.nextLine());
        int workdays = Integer.parseInt(scan.nextLine());



        int processorsMade = (employees * 8 * workdays) / 3;

        if (processorsMade >= processorCount) {
            double profit = (processorsMade - processorCount) * 110.10;
            System.out.printf("Profit: -> %.2f BGN", profit);
        } else {
            double losses = (processorCount - processorsMade) * 110.10;
            System.out.printf("Losses: -> %.2f BGN", losses);
        }

    }

}
