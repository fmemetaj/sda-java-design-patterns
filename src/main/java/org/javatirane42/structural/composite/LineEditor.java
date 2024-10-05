package org.javatirane42.structural.composite;

import java.util.List;

public class LineEditor {

    private final CompoundLine compoundLine = new CompoundLine();

    public void selectAndRemove(List<Line> lines) {
        lines.forEach(compoundLine::removeLine);
    }

    public void createLine(String type) {
        if (type.equals("dotted")) {
            compoundLine.addLine(new DottedLine());
        } else {
            compoundLine.addLine(new SolidLine());
        }
    }

    public void drawShortAllAtPoint(Point point) {
        compoundLine.setStartingPosition(point);
        compoundLine.draw(5.0);
    }
}
