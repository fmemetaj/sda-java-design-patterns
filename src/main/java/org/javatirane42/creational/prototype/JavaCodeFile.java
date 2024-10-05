package org.javatirane42.creational.prototype;

public class JavaCodeFile implements Cloneable {
    private String fileName;
    private String code;

    public JavaCodeFile(String fileName, String code) {
        this.fileName = fileName;
        this.code = code;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public JavaCodeFile createClone() throws CloneNotSupportedException {
        return (JavaCodeFile) super.clone();
    }

    @Override
    public String toString() {
        return "JavaCodeFile{" +
                "fileName='" + fileName + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
