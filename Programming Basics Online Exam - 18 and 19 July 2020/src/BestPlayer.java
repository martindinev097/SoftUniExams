import java.util.Scanner;

public class BestPlayer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String player = "";

        int maxValue = Integer.MIN_VALUE;

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scan.nextLine());

            if (goals > maxValue) {
                maxValue = goals;
                player = name;
            }

            if (goals >= 10) {
                break;
            }

            name = scan.nextLine();
        }

        System.out.printf("%s is the best player!%n", player);

        if (maxValue >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxValue);
        } else {
            System.out.printf("He has scored %d goals.", maxValue);
        }

    }

}
