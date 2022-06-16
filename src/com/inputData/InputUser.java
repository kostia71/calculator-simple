package com.inputData;

import java.io.IOException;
import java.util.Scanner;

public class InputUser {

    private int number1;
    private int number2;
    private String operand;

    Scanner in = new Scanner(System.in);

    public int getNumber1() {
        System.out.println("Введите number1: ");
        return Integer.parseInt(in.nextLine());
    }


    public int getNumber2() {
        System.out.println("Введите number2: ");
        return Integer.parseInt(in.nextLine());
    }

    public String getOperand() {
        System.out.println("Введите operand: ");
        return operand = in.nextLine();
    }

}
