/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

/**
 *
 * @author Falki
 */
public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.setWidth(width);
        this.setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color = " + getColor() + ", filled = " + isFilled() + '}';
    }
}
