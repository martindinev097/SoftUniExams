import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double people = Integer.parseInt(scan.nextLine());
        double nights = Integer.parseInt(scan.nextLine());
        double cards = Integer.parseInt(scan.nextLine());
        double tickets = Integer.parseInt(scan.nextLine());

        double totalSum = people * (nights * 20 + cards * 1.6 + tickets * 6) * 1.25;

        System.out.printf("%.2f", totalSum);

    }

}
