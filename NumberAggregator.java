package additionalInputs;

import java.util.Scanner;

public class NumberAggregator {
    public int addNumber() {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        int total = 0;
        boolean isMismatched;
        do {
            isMismatched = true;

            try {
                System.out.println("Please input an integer\n");

                String usrInput = sc.next();

                number = Integer.parseInt(usrInput);
                total+= number;

            } catch (NumberFormatException ex) {
                isMismatched = false;
                System.out.println("This is not an integer\n");
                System.out.println("Total of integers  : " + total);
            }
        } while (isMismatched);

        return total;
       // sc.close();

    }
}
