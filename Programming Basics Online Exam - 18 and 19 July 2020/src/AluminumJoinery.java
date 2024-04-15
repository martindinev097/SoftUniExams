import java.util.Scanner;

public class AluminumJoinery {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int frameCount = Integer.parseInt(scan.nextLine());
        String frameType = scan.nextLine();
        String delivery = scan.nextLine();

        double price = 0;

        if (frameCount >= 10) {
            switch (frameType) {
                case "90X130":
                    price = frameCount * 110;
                    if (frameCount > 30 && frameCount <= 60) {
                        price *= 0.95;
                    } else if (frameCount > 60) {
                        price *= 0.92;
                    }
                    break;
                case "100X150":
                    price = frameCount * 140;
                    if (frameCount > 40 && frameCount <= 80) {
                        price *= 0.94;
                    } else if (frameCount > 80) {
                        price *= 0.90;
                    }
                    break;
                case "130X180":
                    price = frameCount * 190;
                    if (frameCount > 20 && frameCount <= 50) {
                        price *= 0.93;
                    } else if (frameCount > 50) {
                        price *= 0.88;
                    }
                    break;
                case "200X300":
                    price = frameCount * 250;
                    if (frameCount > 25 && frameCount <= 50) {
                        price *= 0.91;
                    } else if (frameCount > 50) {
                        price *= 0.86;
                    }
                    break;
            }

            if (delivery.equals("With delivery")) {
                price += 60;
            }

            if (delivery.equals("Without delivery")) {
                price += 0;
            }

            if (frameCount > 99) {
                price *= 0.96;
            }

            System.out.printf("%.2f BGN",price);

        } else {
            System.out.println("Invalid order");
        }

    }

}
