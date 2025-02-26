package org.javatirane42.behavioral.interpreter;

import java.util.Scanner;

public class InterpreterMain {

    public static void main(String[] args) {
        MathOperationApplier mathOperationApplier = new MathOperationApplier();
        Interpreter interpreter = new PythonStyleWithoutOrderMathOperationsInterpreter(mathOperationApplier);

        Scanner scanner = new Scanner(System.in);
        String result = interpreter.interpret(scanner.nextLine());
        System.out.println(result);

        interpreter = new WordsWithoutOrderMathOperationsInterpreter(mathOperationApplier);
        result = interpreter.interpret(scanner.nextLine());
        System.out.println(result);
    }
}
