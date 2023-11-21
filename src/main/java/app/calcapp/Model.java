package app.calcapp;

public class Model {
    public int calculate(String operator, int a, int b) {
        if (operator.equals("+")) {
            return a + b;
        }
        else if (operator.equals("-")) {
            return a - b;
        }
        else if (operator.equals("×")) {
            return a * b;
        }
        else {
            return a / b;
        }
    }
}
