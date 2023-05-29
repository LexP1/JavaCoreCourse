package ru.gb.calc.others;

import java.util.Scanner;

public class Input {
    public static int input() {
        boolean b = true;
        int n = 0;
        while (b == true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите число: ");
                n = scanner.nextInt();
                b = false;
            } catch (Exception e) {
                System.out.println("Введно не верное значение...");
            }
        }
        return n;
    }
}
