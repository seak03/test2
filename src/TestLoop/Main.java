package src.TestLoop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bitte eine natürliche Zahl: ");
            int numberInt;
            try {
                numberInt = scanner.nextInt();
                scanner.nextLine(); // Eingabepuffer bereinigen
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Eingabepuffer bereinigen, wenn
                System.out.println("Keine gültige Eingabe!");
                continue;
            }
            if (numberInt < 0)
                System.out.println("Keine gültige Eingabe");
            else
                System.out.println("Nummer: " + numberInt);
        }

    }
}
