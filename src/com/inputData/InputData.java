package com.inputData;

import java.util.Scanner;

public class InputData {

    public Scanner in;

    public int getNumber1() {
        in = new Scanner(System.in);
        System.out.println("Введите number1: ");
        return in.nextInt();
    }

    public int getNumber2() {
        in = new Scanner(System.in);
        System.out.println("Введите number2: ");
        int num2 = in.nextInt();
        in.nextLine();
        return num2;
    }

    public String getOperand() {
        in = new Scanner(System.in);
        System.out.println("Введите operand: ");
        String operand = in.nextLine();
        return operand;
    }

}
