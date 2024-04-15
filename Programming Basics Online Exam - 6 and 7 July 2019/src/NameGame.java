import java.util.Scanner;

public class NameGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int points = 0;
        int maxValue = Integer.MIN_VALUE;
        String winnerName = "";

        while (!name.equals("Stop")) {
            points = 0;
            for (int position = 0; position < name.length(); position++) {
                int num = Integer.parseInt(scan.nextLine());
                char currentChar = name.charAt(position);

                int ascii = currentChar;

                if (ascii == num) {
                    points += 10;
                } else {
                    points += 2;
                }

                if (points >= maxValue) {
                    maxValue = points;
                    winnerName = name;
                }
            }

            name = scan.nextLine();

        }

        System.out.printf("The winner is %s with %d points!", winnerName, maxValue);

    }

}