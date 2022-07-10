package com.outputData;

import com.service.Calculator;

public class OutputData {
    Calculator calculator;

    public void outputResult() {
        calculator = new Calculator();
        System.out.println(calculator.calculation());
    }
}
