package org.javatirane42.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        JavaCodeFilesManager javaCodeFilesManager = new JavaCodeFilesManager();

        JavaCodeFile fileA = javaCodeFilesManager.createFileWithContent("Integers", "int x = 3;");
        JavaCodeFile fileB = javaCodeFilesManager.createFileWithContent("Strings", "String y = \"3\";");

        System.out.println(fileA);
        System.out.println(fileB);
    }
}
