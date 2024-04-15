import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();

        double price = 0;

        switch (season) {
            case "spring":
                if (people <= 5) {
                    price = people * 50;
                } else {
                    price = people * 48;
                }
                break;
            case "summer":
                if (people <= 5) {
                    price = people * 48.5 * 0.85;
                } else {
                    price = people * 45 * 0.85;
                }
                break;
            case "autumn":
                if (people <= 5) {
                    price = people * 60;
                } else {
                    price = people * 49.5;
                }
                break;
            case "winter":
                if (people <= 5) {
                    price = people * 86 * 1.08;
                } else {
                    price = people * 85 * 1.08;
                }
                break;
        }

        System.out.printf("%.2f leva.", price);

    }

}
