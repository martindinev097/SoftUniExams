import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        String souvenir = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        double price = 0;

        switch (team) {
            case "Argentina":
                if (souvenir.equals("flags")) {
                    price = count * 3.25;
                } else if (souvenir.equals("caps")) {
                    price = count * 7.2;
                } else if (souvenir.equals("posters")) {
                    price = count * 5.1;
                } else if (souvenir.equals("stickers")) {
                    price = count * 1.25;
                } else {
                    System.out.println("Invalid stock!");
                    return;
                }
                break;
            case "Brazil":
                if (souvenir.equals("flags")) {
                    price = count * 4.2;
                } else if (souvenir.equals("caps")) {
                    price = count * 8.5;
                } else if (souvenir.equals("posters")) {
                    price = count * 5.35;
                } else if (souvenir.equals("stickers")) {
                    price = count * 1.2;
                } else {
                    System.out.println("Invalid stock!");
                    return;
                }
                break;
            case "Croatia":
                if (souvenir.equals("flags")) {
                    price = count * 2.75;
                } else if (souvenir.equals("caps")) {
                    price = count * 6.9;
                } else if (souvenir.equals("posters")) {
                    price = count * 4.95;
                } else if (souvenir.equals("stickers")) {
                    price = count * 1.1;
                } else {
                    System.out.println("Invalid stock!");
                    return;
                }
                break;
            case "Denmark":
                if (souvenir.equals("flags")) {
                    price = count * 3.1;
                } else if (souvenir.equals("caps")) {
                    price = count * 6.5;
                } else if (souvenir.equals("posters")) {
                    price = count * 4.8;
                } else if (souvenir.equals("stickers")) {
                    price = count * 0.9;
                } else {
                    System.out.println("Invalid stock!");
                    return;
                }
                break;

            default:
                System.out.println("Invalid country!");
                return;
        }

        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", count, souvenir, team, price);

    }

}
