package com.csc205.project1;

public class Point {
    private double x;
    private double y;

    // Constructor that takes x and y coordinates as arguments
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Set both x and y at once
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shifts the point along the X-axis by n units
    public void shiftX(double n) {
        this.x += n;
    }

    // Shifts the point along the Y-axis by n units
    public void shiftY(double n) {
        this.y += n;
    }

    // Calculates the distance to another point p2
    public double distance(Point p2) {
        return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
    }

    // Rotates the point by a specified angle (in radians) around the origin
    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // Override the toString method
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

}
