import java.util.Scanner;

public class Balls {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ballsCount = Integer.parseInt(scan.nextLine());

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int other = 0;
        int black = 0;
        double total = 0;

        for (int colours = 1; colours <= ballsCount; colours++) {
            String colour = scan.nextLine();

            switch (colour) {
                case "red":
                    red++;
                    total += 5;
                    break;
                case "orange":
                    orange++;
                    total += 10;
                    break;
                case "yellow":
                    yellow++;
                    total += 15;
                    break;
                case "white":
                    white++;
                    total += 20;
                    break;
                case "black":
                    black++;
                    total = (Math.floor(total / 2));
                    break;
                default:
                    other++;
                    break;
            }

        }

        System.out.printf("Total points: %.0f%n", total);
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", other);
        System.out.printf("Divides from black balls: %d%n", black);

    }

}
