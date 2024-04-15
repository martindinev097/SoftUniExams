import java.util.Scanner;

public class PCGameShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double hearthCount = 0;
        double fortniteCount = 0;
        double overwatchCount = 0;
        double others = 0;

        for (int i = 1; i <= n; i++) {
            String gameName = scan.nextLine();

            switch (gameName) {
                case "Hearthstone":
                    hearthCount++;
                    break;
                case "Fornite":
                    fortniteCount++;
                    break;
                case "Overwatch":
                    overwatchCount++;
                    break;

                default:
                    others++;
                    break;
            }
        }

        double totalCount = hearthCount + fortniteCount + overwatchCount + others;

        double hearthPerc = (hearthCount / totalCount) * 100;
        double fortnitePerc = (fortniteCount / totalCount) * 100;
        double overPerc = (overwatchCount / totalCount) * 100;
        double othersPerc = 100 - (hearthPerc + fortnitePerc + overPerc);

        System.out.printf("Hearthstone - %.2f%%%nFornite - %.2f%%%nOverwatch - %.2f%%%nOthers - %.2f%%", hearthPerc, fortnitePerc, overPerc, othersPerc);

    }

}