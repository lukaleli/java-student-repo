package com.cokpawel.cw3.zadanie1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* 1. Napisz program, który wczyta liczbe naturalną i wyświetli komunikat o tym, czy jest ona parzysta.
* Należy sprawdzić poprawność formalną i logiczną danej (musi być dodatnią liczbą całkowitą).
* Do sprawdzenia parzystości użyj operatora %, który zwraca resztę z dzielenia (np. wyrażenie
* 5%2 zwróci wartość 1)
*
*/

public class Parzysta {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Podaj liczbę: ");
            int num = Integer.parseInt(bufferedReader.readLine());

            if (num <= 0) {
                System.out.println("Podana liczba powinna być większa od zera.");
                System.exit(0);
            }

            if (num % 2 == 0) {
                System.out.println(String.format("Liczba %d jest liczbą parzystą.", num));
            } else {
                System.out.println(String.format("Liczba %d nie jest liczbą parzystą.", num));
            }

        } catch (NumberFormatException e) {
            System.out.println("Podana wartość jest nieprawidłowa.");
            System.exit(0);
        }
    }
}
