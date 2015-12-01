package com.cokpawel.cw3.zadanie2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* 2. Wczytaj z klawiatury 3 liczby rzeczywiste i sprawdź, czy mogą być one długościami boków trójkąta.
* Należy zastosować instrukcję if, która sprawdzi czy suma długości dwóch dowolnych boków trójkąta
* jest większa od długości trzeciego boku.
*
*/

public class Trojkat {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Podaj bok a: ");
            double a = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Podaj bok b: ");
            double b = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Podaj bok c: ");
            double c = Double.parseDouble(bufferedReader.readLine());

            if (!hasProperSideLengths(a, b, c)) {
                System.out.println("Wszystkie boki trójkąta muszą być większe od zera.");
                System.exit(0);
            }

            if (canFormTriangle(a, b, c)) {
                System.out.println(String.format("Wartości %f, %f i %f mogą być długościami boków trójkąta.", a, b, c));
            } else {
                System.out.println(String.format("Wartości %f, %f i %f NIE mogą być długościami boków trójkąta.", a, b, c));
            }

        } catch (NumberFormatException e) {
            System.out.println("Jedna z wprowadzonych wartości jest nieprawidłowa.");
            System.exit(0);
        }
    }

    private static boolean canFormTriangle(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;
    }

    private static boolean hasProperSideLengths(double a, double b, double c) {
        return a >= 0 && b >= 0 && c >= 0;
    }
}
