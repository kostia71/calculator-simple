package com.service;

import com.inputData.InputData;

import java.util.Scanner;

public class Calculator {
    InputData inputUser;

    public int calculation() {
        int number2 = 0;
        int number1 = 0;
        String operand = "/";
        Scanner in = new Scanner(System.in);
        int result = 0;

        while (number2 == 0 && operand.equals("/")) {

            inputUser = new InputData();
            number1 = inputUser.getNumber1();
            number2 = inputUser.getNumber2();
            operand = inputUser.getOperand();

            if (operand.equals("+")) {
                result = number1 + number2;
            } else if (operand.equals("-")) {
                result = number1 - number2;
            } else if (operand.equals("*")) {
                result = number1 * number2;
            } else if (operand.equals("/")) {
                if (number2 != 0) {
                    result = number1 / number2;
                } else System.out.println("Делить на ноль нельзя");
            }
        }
        return result;
    }
}


