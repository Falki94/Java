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
public class MyRectangle {

    private MyPoint point1;
    private MyPoint point2;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.point1 = new MyPoint(x1, y1);
        this.point2 = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint point1, MyPoint point2) {
        this.point1 = point1;
        this.point1 = point2;
    }

    public double getPerimeter() {
        int x1 = this.point1.getX();
        int x2 = this.point2.getX();
        int y1 = this.point1.getY();
        int y2 = this.point2.getY();
        return 2 * Math.abs(x2 - x1) + 2 * Math.abs(y2 - y1);
    }

    public double getArea() {
        int x1 = this.point1.getX();
        int x2 = this.point2.getX();
        int y1 = this.point1.getY();
        int y2 = this.point2.getY();
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    public String toString() {
        return "MyRectangle{" + "point1=" + point1 + ", point2=" + point2 + '}';
    }

}
