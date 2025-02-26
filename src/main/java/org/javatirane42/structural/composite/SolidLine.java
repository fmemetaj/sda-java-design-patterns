package org.javatirane42.structural.composite;

public class SolidLine implements Line {

    private Point point = new Point(0, 0);

    @Override
    public void draw(double lengthInPixels) {
        System.out.println("Drawing solid line starting in (" + point.getX() + ", " + point.getY() + ") with length " + lengthInPixels);
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
