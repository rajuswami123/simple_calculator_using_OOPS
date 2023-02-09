package org.example;

import java.util.Scanner;

class Operation {
    int num1, num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int performOperation() {
        return 0;
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
        Operation add = new Addition();
        add.setNum1(10);
        add.setNum2(5);
        System.out.println("Addition: " + add.performOperation());

        Operation subtract = new Subtraction();
        subtract.setNum1(10);
        subtract.setNum2(5);
        System.out.println("Subtraction: " + subtract.performOperation());

        Operation multiply = new Multiplication();
        multiply.setNum1(10);
        multiply.setNum2(5);
        System.out.println("Multiplication: " + multiply.performOperation());

        Operation divide = new Division();
        divide.setNum1(10);
        divide.setNum2(5);
        System.out.println("Division: " + divide.performOperation());
    }
}
