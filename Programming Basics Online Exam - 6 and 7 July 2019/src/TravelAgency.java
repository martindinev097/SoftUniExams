import java.util.Scanner;

public class TravelAgency {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine();
        String type = scan.nextLine();
        String vip = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double price = 0;

        if (days < 1) {
            System.out.println("Days must be positive number!");
            return;
        }

        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (type) {
                    case "withEquipment":
                        price = days * 100;

                        if (days > 7) {
                            price = (days - 1) * 100;
                        }
                        if (vip.equals("yes")) {
                            price = price * 0.9;
                        } else {
                            price = days * 100;
                        }

                        break;
                    case "noEquipment":
                        price = days * 80;

                        if (days > 7) {
                            price = (days - 1) * 80;
                        }
                        if (vip.equals("yes")) {
                            price = price * 0.95;
                        } else {
                            price = days * 80;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        return;
                }
                break;

            case "Varna":
            case "Burgas":
                switch (type) {
                    case "withBreakfast":
                        price = days * 130;

                        if (days > 7) {
                            price = (days - 1) * 130;
                        }
                        if (vip.equals("yes")) {
                            price = price * 0.88;
                        } else {
                            price = days * 130;
                        }

                        break;
                    case "noBreakfast":
                        price = days * 100;

                        if (days > 7) {
                            price = (days - 1) * 100;
                        }
                        if (vip.equals("yes")) {
                            price = price * 0.93;
                        } else {
                            price = days * 100;
                        }
                        break;
                    default:
                    System.out.println("Invalid input!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid input!");
                return;
        }

        System.out.printf("The price is %.2flv! Have a nice time!", price);

    }

}