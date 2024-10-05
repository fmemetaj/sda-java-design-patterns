package org.javatirane42.behavioral.command;

import java.util.List;

public class RemoveEmptyLinesCommand implements Command {

    private JavaFile javaFile;

    public RemoveEmptyLinesCommand(JavaFile javaFile) {
        this.javaFile = javaFile;
    }

    @Override
    public void apply() {
        final List<String> nonEmptyLines = javaFile.getLinesContent().stream()
                .filter(line -> !line.trim().isEmpty())
                .toList();
        javaFile.setLinesContent(nonEmptyLines);
    }

    @Override
    public void cancel() {
        throw new UnsupportedOperationException("Cancelling this operation is not possible ATM");
    }
}
