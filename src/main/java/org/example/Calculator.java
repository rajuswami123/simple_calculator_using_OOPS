package org.example;


import java.util.logging.Level;
import java.util.logging.Logger;

class Operation {
    static final int A=0;

    int num1;
    int num2;


    public void setNum1(int num1) {
        this.num1 = num1;
    }


    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int performOperation() {
        return A;
    }
}

class Addition extends Operation {
    @Override
    public int performOperation() {
        return num1 + num2;
    }
}

class Subtraction extends Operation {
    @Override
    public int performOperation() {
        return num1 - num2;
    }
}

class Multiplication extends Operation {
    @Override
    public int performOperation() {
        return num1 * num2;
    }
}

class Division extends Operation {
    @Override
    public int performOperation() {
        return num1 / num2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Logger ou = Logger.getLogger("com.api.jar");
        Operation add = new Addition();
        add.setNum1(10);
        add.setNum2(5);
        ou.log(Level.INFO, () -> "Addition: " + add.performOperation());

        Operation subtract = new Subtraction();
        subtract.setNum1(10);
        subtract.setNum2(5);
        ou.log(Level.INFO, () -> "Subtraction: " + subtract.performOperation());

        Operation multiply = new Multiplication();
        multiply.setNum1(10);
        multiply.setNum2(5);
        ou.log(Level.INFO, () -> "Multiplication: " + multiply.performOperation());

        Operation divide = new Division();
        divide.setNum1(10);
        divide.setNum2(5);
        ou.log(Level.INFO, () -> "Division: " + divide.performOperation());
    }
}
