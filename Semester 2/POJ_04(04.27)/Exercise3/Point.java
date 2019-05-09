/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author Falki
 */
public class Point {

    private float x = 0.0f;
    private float y = 0.0f;
    private float[] axisXY;

    public Point() {

    }

    public Point(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        this.axisXY = new float[2];
        this.axisXY[0] = this.x;
        this.axisXY[1] = this.y;
        return axisXY;
    }

    public void setXY(float[] axis) {
        this.axisXY = axis;
    }

    public String toString() {
        return "Point(" + getXY()[0] + ", " + getXY()[1] + ')';
    }
}
