package org.javatirane42.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        LineEditor lineEditor = new LineEditor();

        lineEditor.createLine("dotted");
        lineEditor.createLine("solid");
        lineEditor.drawShortAllAtPoint(p1);
    }
}
