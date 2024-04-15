import java.util.Scanner;

public class TheMostPowerfulWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        double asciiSum = 0;
        double totalAsciiSum = 0;

        String wordCheck = "";
        String wordStore = "";

        double maxValue = Double.NEGATIVE_INFINITY;

        while (!word.equals("End of words")) {
            asciiSum = 0;

            for (int position = 0; position < word.length(); position++) {
                char currentChar = word.charAt(position);
                int ascii = currentChar;

                String currentLetter = String.valueOf(currentChar);
                asciiSum += ascii;

                    if (position == 0) {
                        if ((currentLetter.equals("A")) || currentLetter.equals("a")) {
                            wordCheck = "true";
                        } else if ((currentLetter.equals("E")) || currentLetter.equals("e")) {
                            wordCheck = "true";
                        } else if ((currentLetter.equals("I")) || currentLetter.equals("i")) {
                            wordCheck = "true";
                        } else if ((currentLetter.equals("O")) || currentLetter.equals("o")) {
                            wordCheck = "true";
                        } else if ((currentLetter.equals("U")) || currentLetter.equals("u")) {
                            wordCheck = "true";
                        } else if ((currentLetter.equals("Y")) || currentLetter.equals("y")) {
                            wordCheck = "true";
                        } else {
                            wordCheck = "false";
                        }
                    }

            }

            if (wordCheck.equals("true")) {
                totalAsciiSum = asciiSum * word.length();
                if (totalAsciiSum >= maxValue) {
                    maxValue = totalAsciiSum;
                    wordStore = word;
                }
            } else {
                totalAsciiSum = Math.floor(asciiSum / word.length());
                if (totalAsciiSum >= maxValue) {
                    maxValue = totalAsciiSum;
                    wordStore = word;
                }
            }

            word = scan.nextLine();

        }

        System.out.printf("The most powerful word is %s - %.0f", wordStore, maxValue);

    }

}