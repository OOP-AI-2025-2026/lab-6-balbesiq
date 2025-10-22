package org.example.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends DrawShape {

    public Ellipse() {}

    public Ellipse(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        double x = Math.min(startPoint.getX(), endPoint.getX());
        double y = Math.min(startPoint.getY(), endPoint.getY());
        double width = Math.abs(startPoint.getX() - endPoint.getX());
        double height = Math.abs(startPoint.getY() - endPoint.getY());

        return new Ellipse2D.Double(x, y, width, height);
    }
}
