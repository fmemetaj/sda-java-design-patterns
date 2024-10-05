package org.javatirane42.creational.prototype;

public class JavaCodeFilesManager {

    private static final JavaCodeFile BASE_FILE = new JavaCodeFile("SDA License", "java");

    public JavaCodeFile createFileWithContent(final String fileName, final String content) throws CloneNotSupportedException {
        JavaCodeFile baseFileClone = BASE_FILE.createClone();
        baseFileClone.setCode(content);
        baseFileClone.setFileName(fileName);
        return baseFileClone;
    }
}
