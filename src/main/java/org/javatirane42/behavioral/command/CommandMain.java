package org.javatirane42.behavioral.command;

import java.util.List;

public class CommandMain {

    public static void main(String[] args) {
        JavaFile javaFile = new JavaFile("Commands.java", "Commands",
                List.of("Command {", " ", "private String content;", "}"));
        Command changeFileNameCommand = new ChangeFileNameCommand(javaFile, "UpdatedCommands.java");
        Command removeEmptyLinesCommand = new RemoveEmptyLinesCommand(javaFile);

        System.out.println(javaFile);

        changeFileNameCommand.apply();
        removeEmptyLinesCommand.apply();

        System.out.println(javaFile);

        changeFileNameCommand.cancel();

        System.out.println(javaFile);
    }
}
