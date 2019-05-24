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
public class MyPoint {

    private int x = 0;
    private int y = 0;
    private int[] axisXY;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        this.axisXY = new int[2];
        this.axisXY[0] = this.x;
        this.axisXY[1] = this.y;
        return this.axisXY;
    }

    public void setXY(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public String toString() {
        return "("+this.getX()+","+this.getY()+")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(getX() - another.getX(), 2) + Math.pow(getY() - another.getY(), 2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }
}
