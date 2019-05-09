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
public class Shape {

    private String color = "String";
    private boolean filled = true;

    public Shape() {
        
    }
    
    public Shape(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        return "Shape(" + "color = " + color + ", " + "filled = " + filled + ')';
    }
}
