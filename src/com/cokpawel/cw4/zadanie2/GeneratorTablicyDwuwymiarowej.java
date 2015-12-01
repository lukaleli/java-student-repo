package com.cokpawel.cw4.zadanie2;

import java.io.IOException;
import java.util.Random;

/*
*
* Napisz program, który generuje do tablicy dwuwymiarowej całkowite liczby losowe z przedziału <-10, 10>,
* a następnie oblicza i wyświetla procent elementów parzystych w losowej kolumnie.
*
*/

public class GeneratorTablicyDwuwymiarowej {
    public static void main(String[] args) throws IOException {
        final int CAPACITY = 10; // ponieważ w zadaniu nie podano wielkości tablicy dwuwymiarowej
        int rangeStart = -10, rangeEnd = 10;
        int[][] array = new int[CAPACITY][CAPACITY];
        int randomColumnIndex = getRandomFromRange(0, array.length - 1);
        int evenNumbersCount = 0;

        for (int i = 0, l = array.length; i < l; i++) {
            for (int j = 0, len = array[i].length; j < len; j++) {
                array[i][j] = getRandomFromRange(rangeStart, rangeEnd);
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

        for (int[] row : array) {
            int num = row[randomColumnIndex];
            if (num % 2 == 0) {
                evenNumbersCount++;
            }
        }

        float evenNumbersPercentage = ((float) evenNumbersCount / array.length) * 100;
        System.out.println(String.format("Indeks losowej kolumny: %d", randomColumnIndex));
        System.out.println(String.format("Procent liczb parzystych w kolumnie wynosi: %.1f%%", evenNumbersPercentage));
    }

    private static int getRandomFromRange(int from, int to) {
        return new Random().nextInt((to - from) + 1) + from;
    }
}
