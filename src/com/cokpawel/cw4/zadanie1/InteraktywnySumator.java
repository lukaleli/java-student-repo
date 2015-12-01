package com.cokpawel.cw4.zadanie1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* Napisz program, który czyta liczby wprowadzone z klawiatury, liczy wprowadzone dane i oblicza ich sumę.
* Liczba danych nie jest z góry znany. Wczytanie zera kończy przebieg programu, powodując wyświetlenie
* liczy wczytanych danych i ich sumy.
*
*/

public class InteraktywnySumator {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;
        try {
            System.out.println("Podaj liczby zatwierdzając każdą eneterem:");

            for (; ; ) {
                int num = Integer.parseInt(bufferedReader.readLine());
                if (num == 0) {
                    break;
                } else {
                    sum += num;
                    count++;
                }
            }

            System.out.println(String.format("Wczytano %d liczb, których suma wynosi %d", count, sum));

        } catch (NumberFormatException e) {
            System.out.println("Wprowadzona wartość jest nieprawidłowa.");
            System.exit(0);
        }
    }
}
