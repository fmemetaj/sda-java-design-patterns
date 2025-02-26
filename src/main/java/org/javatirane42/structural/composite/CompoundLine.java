package org.javatirane42.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundLine implements Line {

    private final List<Line> lines = new ArrayList<>();

    @Override
    public void draw(double lengthInPixels) {
        lines.forEach(line -> line.draw(lengthInPixels));
    }

    @Override
    public void setStartingPosition(Point position) {
        lines.forEach(line -> line.setStartingPosition(position));
    }

    @Override
    public Point getStartingPoint() {
        if (lines.isEmpty()) {
            return new Point(0, 0);
        }
        return lines.get(0).getStartingPoint();
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    public void removeLine(Line line) {
        lines.remove(line);
    }
}
