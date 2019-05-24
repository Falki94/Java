/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaaaaaaaaaaaaaaaaaaaaava;

/**
 *
 * @author Falki
 */
public class MyCircle {

    private MyPoint center;
    private int radius = 1;

    public MyCircle() {

    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }
    
    public String toString(){
        return "MyCircle[radius=" + getRadius()+", center=" + center + "]";
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
        return this.center.distance(another.getCenter());
    }
}
