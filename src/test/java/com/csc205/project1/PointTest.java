package com.csc205.project1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AI Prompt: Generate additional unit tests for the Point class, focusing on edge cases such as negative coordinates,
 * large values, zero rotation, and distance calculations with decimals.
 */

class PointTest {

    @Test
    void testNegativeCoordinates() {
        Point point = new Point(-5, -10);
        assertEquals(-5, point.getX());
        assertEquals(-10, point.getY());
    }

    @Test
    void testLargeCoordinateValues() {
        Point point = new Point(1e9, 1e9);
        point.shiftX(1e9);
        point.shiftY(1e9);
        assertEquals(2e9, point.getX());
        assertEquals(2e9, point.getY());
    }

    @Test
    void testDistanceWithDecimals() {
        Point point1 = new Point(1.5, 2.5);
        Point point2 = new Point(4.5, 6.5);
        double expectedDistance = Math.sqrt(9 + 16); // 5.0
        assertEquals(5.0, point1.distance(point2), 1e-9);
    }

    @Test
    void testZeroRotation() {
        Point point = new Point(3, 4);
        point.rotate(0);
        assertEquals(3, point.getX(), 1e-9);
        assertEquals(4, point.getY(), 1e-9);
    }

    @Test
    void testRotateBy180Degrees() {
        Point point = new Point(3, 4);
        point.rotate(Math.PI); // Rotate by 180 degrees
        assertEquals(-3, point.getX(), 1e-9);
        assertEquals(-4, point.getY(), 1e-9);
    }
}

