package com.inputData;

import java.io.IOException;
import java.util.Scanner;

public class InputUser {

    private String number1;
    private String number2;
    private String operand;

    Scanner in = new Scanner(System.in);

    public String getNumber1() {
        System.out.println("Введите number1: ");
        return number1 = in.nextLine();
    }


    public String getNumber2() {
        System.out.println("Введите number2: ");
        return number2 = in.nextLine();
    }

    public String getOperand() {
        System.out.println("Введите operand: ");
        return operand = in.nextLine();
    }

}
