import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int seaCount = Integer.parseInt(scan.nextLine());
        int mountainCount = Integer.parseInt(scan.nextLine());

        String packName = scan.nextLine();

        int totalSum = 0;

        while (!packName.equals("Stop")) {
            if (packName.equals("sea")) {
                seaCount--;
                if (seaCount < 0) {
                    packName = scan.nextLine();
                    continue;
                } else {
                    totalSum += 680;
                }
            } else if (packName.equals("mountain")) {
                mountainCount--;
                if (mountainCount < 0) {
                    packName = scan.nextLine();
                    continue;
                } else {
                    totalSum += 499;
                }
            }

            if (seaCount <= 0 && mountainCount <= 0) {
                System.out.println("Good job! Everything is sold.");
                break;
            }

            packName = scan.nextLine();

        }

        System.out.printf("Profit: %d leva.", totalSum);

    }

}
