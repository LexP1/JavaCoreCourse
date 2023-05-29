package ru.gb.calc.others;

public class Operation {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        int res = 0;
        try {
            res = a / b;
        } catch (ArithmeticException e){
            System.out.println("Что-то пошло не так");
        }
        return res;
    }

    public static int sub(int a, int b){
        return a - b;
    }
}
