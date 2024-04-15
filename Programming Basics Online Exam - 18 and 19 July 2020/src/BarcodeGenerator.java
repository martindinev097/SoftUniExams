import java.util.Scanner;

public class BarcodeGenerator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        int one = start / 1000;
        int two = (start - (one * 1000)) / 100;
        int three = (start - (one * 1000 + two * 100)) / 10;
        int four = (start - (one * 1000 + two * 100 + three * 10));

        int oneE = end / 1000;
        int twoE = (end - (oneE * 1000)) / 100;
        int threeE = (end - (oneE * 1000 + twoE * 100)) / 10;
        int fourE = (end - (oneE * 1000 + twoE * 100 + threeE * 10));

        for (int first = one; first <= oneE; first++) {
            for (int second = two; second <= twoE; second++) {
                for (int third = three; third <= threeE; third++) {
                    for (int fourth = four; fourth <= fourE; fourth++) {
                        if (first % 2 != 0 && second % 2 != 0 && third % 2 != 0 && fourth % 2 != 0) {
                            System.out.printf("%d%d%d%d ", first, second, third, fourth);
                        }
                    }
                }
            }
        }


    }

}
