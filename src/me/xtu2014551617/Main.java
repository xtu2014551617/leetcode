package me.xtu2014551617;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tCase = in.nextInt();
        while (tCase-- != 0) {
            int row = in.nextInt();
            for (int i = 0; i < row; i++) {
                if (i == 0 || i == row - 1) {
                    printTopOrBottom(row);
                } else if (i >= 1 && i <= row / 2 - 1) {
                    printTopBody(i, row);
                } else {
                    printBottomBody(i, row);
                }
            }
        }
    }

    private static void printTopOrBottom(int row) {
        printContent('-', row - 1);
        printContent('\n', 1);
    }

    private static void printTopBody(int no, int row) {
        printContent(' ', no - 1);
        printContent('\\', 1);
        if (no == 1) {
            printContent(' ', row - no * 2 - 1);
        } else {
            printContent('*', row - no * 2 - 1);
        }
        printContent('/', 1);
        printContent('\n', 1);
    }

    private static void printBottomBody(int no, int row) {
        printContent(' ',(row - no - 1) - 1);
        printContent('/', 1);
        printContent(' ', row/2 - (row - no - 1) - 1);
        printContent('*', 1);
        printContent(' ', row/2 - (row - no - 1) - 1);
        printContent('\\', 1);
        printContent('\n', 1);
    }

    private static void printContent(char character, int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(character);
        }
    }
}
