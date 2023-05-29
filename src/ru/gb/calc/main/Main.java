package ru.gb.calc.main;

import static ru.gb.calc.others.Input.input;
import static ru.gb.calc.others.Operation.sum;


public class Main {
    public static void main(String[] args) {
        int a = input();
        int b = input();
        System.out.println(sum(a, b));
    }
}
