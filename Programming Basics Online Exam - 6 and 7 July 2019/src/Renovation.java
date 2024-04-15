import java.util.Scanner;

public class Renovation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int height = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int percentToNotPaint = Integer.parseInt(scan.nextLine());

        double allToPaint = 4 * (height * width * ((100 - percentToNotPaint) / 100.0));
        int totalPaint = 0;

        String command = scan.nextLine();

        while (!command.equals("Tired!")) {
            int paint = Integer.parseInt(command);

            totalPaint += paint;

            if (totalPaint > allToPaint) {
                System.out.printf("All walls are painted and you have %.0f l paint left!", totalPaint - allToPaint);
                return;
            } else if (totalPaint == allToPaint) {
                System.out.println("All walls are painted! Great job, Pesho!");
                return;
            }

            command = scan.nextLine();
        }

        System.out.printf("%.0f quadratic m left.", Math.ceil(allToPaint - totalPaint));

    }

}
