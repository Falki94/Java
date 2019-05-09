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
public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

//    public void setWidth(double side) {
//        this.setWidth(side);
//    }
//
//    public void setLength(double side) {
//        this.setLength(side);
//    }
    public String toString() {
        return "Square{" + "side=" + getSide() + ", color = " + getColor() + ", " + "filled = " + isFilled() + '}';
    }

}
