package org.javatirane42.behavioral.interpreter;

public class PythonStyleWithoutOrderMathOperationsInterpreter implements Interpreter {

    private MathOperationApplier mathOperationApplier;

    public PythonStyleWithoutOrderMathOperationsInterpreter(MathOperationApplier mathOperationApplier) {
        this.mathOperationApplier = mathOperationApplier;
    }

    @Override
    public String interpret(String context) {
        final String[] splitData = context.trim().split(" ");

        if (splitData.length % 2 == 0) {
            return "Expression is incorrect";
        }

        Double value = Double.valueOf(splitData[0]);
        for (int idx = 1; idx < splitData.length - 1; idx += 2) {
            value = mathOperationApplier.apply(extractOperation(splitData[idx]), value, Double.valueOf(splitData[idx + 1]));
        }
        return value.toString();
    }

    private MathOperation extractOperation(final String operation) {
        switch (operation) {
            case "+":
                return MathOperation.ADD;
            case "-":
                return MathOperation.SUBTRACT;
            case "*":
                return MathOperation.MULTIPLY;
            case "/":
                return MathOperation.DIVIDE;
            case "**":
                return MathOperation.EXPONENTIATION;
        }
        throw new UnsupportedOperationException();
    }
}
