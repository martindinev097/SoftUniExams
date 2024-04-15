import java.util.Scanner;

public class BarcodeGenerator2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;

        for (int currentNum = start; currentNum <= end; currentNum++) {
            String numToText = String.valueOf(currentNum);
            for (int position = 0; position < numToText.length(); position++) {
                int currentDigit = Integer.parseInt(String.valueOf(numToText.charAt(position)));

                if (position == 0 && currentDigit % 2 != 0) {
                    digit1 = currentDigit;
                }
                if (position == 1 && currentDigit % 2 != 0) {
                    digit2 = currentDigit;
                }
                if (position == 2 && currentDigit % 2 != 0) {
                    digit3 = currentDigit;
                }
                if (position == 3 && currentDigit % 2 != 0) {
                    digit4 = currentDigit;
                }

                if (position == 3 && digit1 % 2 != 0 && digit2 % 2 != 0 && digit3 % 2 != 0 && digit4 % 2 != 0) {
                    System.out.printf("%d%d%d%d ", digit1, digit2, digit3, digit4);
                }

            }
        }

    }

}
