package com.cokpawel.cw4.zadanie3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*
* Napisz program który dla wartości całkowitej n podanej z klawiatury, wypełnia tablicę dwuwymiarową
* o wymiarach (2n + 1) x (2n + 1) gwiazdkamim które utworzą wzór ....
*
*/
public class Gwiazdor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String[][] array;
        String EMPTY = " ";
        String FULL = "*";
        try {
            System.out.println("Podaj liczbę n:");
            n = Integer.parseInt(bufferedReader.readLine());
            int dimension = (2 * n) + 1;
            array = new String[dimension][dimension];
            int startingPoint = ((dimension + 1) / 2) - 1;

            for (int i = 0, l = (dimension + 1) / 2; i < l; i++) {
                for (int j = 0, len = array[i].length; j < len; j++) {
                    if (i == 0) {
                        if (j == startingPoint) {
                            array[i][j] = FULL;
                            array[array.length - i - 1][j] = FULL;
                        } else {
                            array[i][j] = EMPTY;
                            array[array.length - i - 1][j] = EMPTY;
                        }
                    } else {
                        int first = startingPoint - i;
                        int second = startingPoint + i;

                        if (j == first || j == second) {
                            array[i][j] = FULL;
                            array[array.length - i - 1][j] = FULL;
                        } else {
                            array[i][j] = EMPTY;
                            array[array.length - i - 1][j] = EMPTY;
                        }
                    }

                }
            }

            for (String[] row : array) {
                for (String column : row) {
                    System.out.print(column);
                }
                System.out.print("\n");
            }


        } catch (NumberFormatException e) {
            System.out.println("Wprowadzona wartość jest nieprawidłowa.");
            System.exit(0);
        }
    }
}
