package org.javatirane42.behavioral.command;

public class ChangeFileNameCommand implements Command {

    private JavaFile javaFile;
    private String newName;
    private String previousName = null;

    public ChangeFileNameCommand(JavaFile javaFile, String newName) {
        this.javaFile = javaFile;
        this.newName = newName;
    }

    @Override
    public void apply() {
        if (javaFile.getFileName().equals(newName)) {
            System.out.println("Cannot change file name to same one");
        } else {
            previousName = javaFile.getFileName();
            javaFile.setFileName(newName);
            javaFile.setClassName(newName.substring(0, newName.length() - 5));
            System.out.println("File name changed to " + newName);
        }
    }

    @Override
    public void cancel() {
        if (previousName == null) {
            System.out.println("Cannot cancel command");
        } else {
            javaFile.setFileName(previousName);
            javaFile.setClassName(previousName);
            previousName = null;
        }
    }
}
