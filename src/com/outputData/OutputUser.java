package com.outputData;

import com.service.Calculation;

public class OutputUser {
    Calculation calculation;

    public void outputResult() {
        calculation = new Calculation();
        System.out.println(calculation.calculation());
    }
}
