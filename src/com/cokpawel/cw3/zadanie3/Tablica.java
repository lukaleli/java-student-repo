package com.cokpawel.cw3.zadanie3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
*
* 3. Napisz program, w którym zadeklaruj 10 elementową tablię liczb całkowitych. Wypełnij
* ją liczbami losowymi od 10 do 20, a następnie wyświetl wygenerowane elementy w jednym wierszu.
* Wczytaj liczbę całkowitą i sprawdź, ile elementów tablicy jest mniejszych bądź równych tej wartości.
* Wynik wyświetl wraz z opisem.
*
* 4. Uzupełnij zadanie 3, tak by dodatkowo obliczać sumę elementów tablicy, które spełniaja zadany warunek.
*
*/

public class Tablica {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int rangeStart = 10, rangeEnd = 20;

        for (int i = 0, l = numbers.length; i < l; i++) {
            numbers[i] = getRandomFromRange(rangeStart, rangeEnd);
            System.out.print(numbers[i] + " ");
        }

        try {
            System.out.println(String.format("\nPodaj liczbę całkowitą z zakresu <%d, %d>: ", rangeStart, rangeEnd));
            int comparable = Integer.parseInt(bufferedReader.readLine());

            int count = 0;
            int sum = 0;

            for (int i = 0, l = numbers.length; i < l; i++) {
                if (numbers[i] <= comparable) {
                    count++;
                    sum += numbers[i];
                }
            }

            if (count == 0) {
                System.out.println(String.format("W tablicy nie znaleziono liczb mniejszych lub równych liczbie %d", comparable));
            } else {
                System.out.println(String.format("W tablicy znaleziono %d liczb mniejszych lub równych liczbie %d", count, comparable));
                System.out.println(String.format("Suma liczb spełniających powyższe kryteria wynosi %d", sum));
            }

        } catch (NumberFormatException e) {
            System.out.println("Podana liczba jest nieprawidłowa.");
            System.exit(0);
        }
    }

    private static int getRandomFromRange(int from, int to) {
        return new Random().nextInt((to - from) + 1) + from;
    }
}
