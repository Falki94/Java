/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

import static java.lang.Math.PI;

/**
 *
 * @author Falki
 */
public class Circle {

    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
