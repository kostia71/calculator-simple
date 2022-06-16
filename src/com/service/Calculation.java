package com.service;

import com.inputData.InputUser;
import com.outputData.OutputUser;

public class Calculation {
    InputUser inputUser;
    String operand;

    public int calculation() {
        inputUser = new InputUser();
        int result = 0;
        operand = inputUser.getOperand();

        if (operand.equals("+")) {
            result = inputUser.getNumber1() + inputUser.getNumber2();
        } else if (operand.equals("-")) {
            result = inputUser.getNumber1() - inputUser.getNumber2();
        } else if (operand.equals("*")) {
            result = inputUser.getNumber1() * inputUser.getNumber2();
        } else if (operand.equals("/")) {
            int divaded = inputUser.getNumber2();
            if (divaded != 0) {
                result = inputUser.getNumber1() / divaded;
            } else {
                System.out.println("Делить на ноль нельзя");
            }
        }
        return result;
    }
}

