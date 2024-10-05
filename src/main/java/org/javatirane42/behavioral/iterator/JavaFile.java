package org.javatirane42.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaFile implements Iterable<String> {

    private String fileName;
    private String className;
    private List<String> linesContent = new ArrayList<>();

    public JavaFile(String fileName, String className, List<String> linesContent) {
        this.fileName = fileName;
        this.className = className;
        this.linesContent = linesContent;
    }

    public void addLine(final String line) {
        linesContent.add(line);
    }

    @Override
    public String toString() {
        return "JavaFile{" +
                "fileName='" + fileName + '\'' +
                ", className='" + className + '\'' +
                ", linesContent=" + linesContent +
                '}';
    }

    @Override
    public Iterator<String> iterator() {
        return linesContent.iterator();
    }
}
