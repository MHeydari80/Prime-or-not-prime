package primecomposite;

import java.util.Scanner;

public class PrimeComposite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int entryNumber = input.nextInt();
        boolean prime = false;

        for (int i = 2; i <= entryNumber / 2; i++) {

            if (entryNumber % i == 0) {
                prime = true;
                break;
            }
        }

        if (prime) {
            System.out.println(String.format("%d is composite !!!", entryNumber));
        } else {
            System.out.println(String.format("%d is prime !!!", entryNumber));
        }
    }
}
