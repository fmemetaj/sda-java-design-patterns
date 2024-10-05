package org.javatirane42.structural.composite;

public interface Line {
    void draw(double lengthInPixels);
    void setStartingPosition(Point position);
    Point getStartingPoint();
}
