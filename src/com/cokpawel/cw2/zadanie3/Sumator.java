package com.cokpawel.cw2.zadanie3;

/*
*
* Utwórz projekt o nazwie Zadanie3, który umożliwi obliczenie sumy liczb całkowitych z przedziału podanego
* w dwóch pierwszych argumentach programu. Podobnie jak w ćwiczeniu 1 przypisz dwóm zmiennym całkowitym
* wartości tych argumentów. Zastosuj instrukcję for dla obliczenia sumy, odpowiednio określając zakres
* wartości zmiennej sterującej pętlą. Wynik sumowania wyświetl w postaci tekstu:
* "Suma liczb od xxx do yyy wynosi zzz"
*
*/

public class Sumator {
    public static void main(String[] args) {
        int from = 0, to = 0, sum = 0;
        if (args.length == 2) {
            try {
                from = Integer.parseInt(args[0]);
                to = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Wartości argumentów powinny być liczbąmi.");
                System.exit(0);
            }
        } else {
            System.out.println("Nie podano argumentów");
            System.exit(0);
        }


        for (int i = from; i <= to; i++) {
            sum += i;
        }

        System.out.println(String.format("Suma liczb od %d do %d wynosi %d", from, to, sum));
    }
}
