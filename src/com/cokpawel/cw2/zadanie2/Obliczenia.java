package com.cokpawel.cw2.zadanie2;

/*
*
* Utwórz projekt o nazwie Zadanie2, zawierający klasę o nazwie Obliczenia, której metoda główna
* wyświetla na konsoli następujące wyniki obliczeń:
* - sumę składników postaci i^2 dla i = 0, ...., n; wartość n jest podana jako pierwszy argument programu
* - iloczyn czynników podanych jako argumenty programu
* Zabezpiecz program przed błędem konwersji za pomocą instrukcji try-catch. Wyświetlaj wyniki metodą
* System.out.println(), uzupełniając wyliczone wartości odpowiednimi komentarzami.
*
*/

public class Obliczenia {
    public static void main(String[] args) {
        int n = 0, sum = 0, product = 1;
        if (args.length == 1) {
            try {
                n = Integer.parseInt(args[0]);
                System.out.println("n = " + n);
            } catch (NumberFormatException e) {
                System.out.println("Wartość argumentu powinna być liczbą.");
                System.exit(0);
            }
        } else {
            System.out.println("Nie podano argumentu");
            System.exit(0);
        }

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Suma: " + sum);

        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        System.out.println("Iloczyn: " + product);
    }
}
