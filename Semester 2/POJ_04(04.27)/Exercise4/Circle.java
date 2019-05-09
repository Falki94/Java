/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise4;

import static java.lang.Math.PI;

/**
 *
 * @author Falki
 */
public class Circle extends Shape{
    private double radius = 1.0;
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.setRadius(radius);
    }
    public Circle (double radius, String color, boolean filled){
        super(color,filled);
        this.setRadius(radius);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }

    public String toString() {
        return "Circle{" + "radius = " + radius + ", color = " + getColor() + ", " + "filled = " + isFilled() + '}';
    }   
}
