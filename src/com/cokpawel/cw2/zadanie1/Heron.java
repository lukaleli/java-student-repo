package com.cokpawel.cw2.zadanie1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* Utwórz projekt o nazwie Zadanie1, zawierający klasę główną o nazwie Horner (prawidłowa nazwa powinną brzmieć HERON).
* Korzystając ze wzoru Herona, oblicz pole trójkąta o bokach a, b, c wczytanych z klawiatury. W programie należy
* uwzględnić obsługę wyjątków związanych z czytaniem danych i konwersją tekstu na liczby.
*
*/

public class Heron {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Podaj bok a: ");
            int a = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Podaj bok b: ");
            int b = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Podaj bok c: ");
            int c = Integer.parseInt(bufferedReader.readLine());

            checkIfPositive(a);
            checkIfPositive(b);
            checkIfPositive(c);

            double result = calculateTriangleArea(a, b, c);
            System.out.println("Pole trójkąta wynosi: " + String.format("%.4f", result));
        } catch (NumberFormatException e) {
            System.out.println("Jedna z wprowadzonych wartości jest nieprawidłowa.");
            System.exit(0);
        }
    }

    private static void checkIfPositive(int number) {
        if (number <= 0) {
            System.out.println(number + " to nieprawidłowa wartość. Długość boku musi być wartością dodatnią.");
            System.exit(0);
        }
    }

    private static double calculateFactor(int a, int b, int c) {
        return (double) (a + b + c) / 2;
    }

    private static double calculateTriangleArea(int a, int b, int c) {
        double factor = calculateFactor(a, b, c);
        return Math.sqrt(factor * (factor - a) * (factor - b) * (factor - c));
    }
}
