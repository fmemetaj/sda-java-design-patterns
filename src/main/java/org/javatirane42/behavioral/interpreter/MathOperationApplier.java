package org.javatirane42.behavioral.interpreter;

public class MathOperationApplier {

    public Double apply(MathOperation mathOperation, Double first, Double second) {
        switch (mathOperation) {
            case ADD:
                return first + second;
            case DIVIDE:
                return first / second;
            case MULTIPLY:
                return first * second;
            case SUBTRACT:
                return first - second;
            case EXPONENTIATION:
                return Math.pow(first, second);
        }
        throw new UnsupportedOperationException();
    }
}
