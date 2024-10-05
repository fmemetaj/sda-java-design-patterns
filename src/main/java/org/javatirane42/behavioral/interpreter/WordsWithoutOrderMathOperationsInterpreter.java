package org.javatirane42.behavioral.interpreter;

public class WordsWithoutOrderMathOperationsInterpreter implements Interpreter {

    private MathOperationApplier mathOperationApplier;

    public WordsWithoutOrderMathOperationsInterpreter(MathOperationApplier mathOperationApplier) {
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
        return MathOperation.valueOf(operation);
    }
}
