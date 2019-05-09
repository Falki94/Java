/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author Falki
 */
public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;
    private float[] axisXY;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        this.axisXY = new float[2];
        this.axisXY[0] = this.x;
        this.axisXY[1] = this.y;
        return this.axisXY;
    }

    public void setXY(float[] tablica) {
        this.axisXY = tablica;
    }

    public String toString() {
        return "Point2D{" + getXY()[0] + "," + getXY()[1] + '}';
    }
}
