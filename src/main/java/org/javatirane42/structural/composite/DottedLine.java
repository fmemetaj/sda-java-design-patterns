package org.javatirane42.structural.composite;

public class DottedLine implements Line {

    private Point point = new Point(10, 10);

    @Override
    public void draw(double lengthInPixels) {
        System.out.println("Drawing d.o.t.t.e.d line starting in (" + point.getX() + ", " + point.getY() + ") with length " + lengthInPixels);
    }

    @Override
    public void setStartingPosition(Point position) {
        this.point = position;
    }

    @Override
    public Point getStartingPoint() {
        return point;
    }
}
