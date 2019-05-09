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
public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] speed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.setXSpeed(xSpeed);
        this.setYSpeed(ySpeed);
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.getXSpeed(), this.getYSpeed()};
    }

    public void setSpeed(float[] speed) {
        this.speed = speed;
    }

    public String toString() {
        return "Point(" + getXY()[0] + ", " + getXY()[1] + ", speed=(" + getXSpeed() + ", " + getYSpeed() + ')';
    }

    public MovablePoint move() {
        this.setX(this.getX() + this.getXSpeed());
        this.setY(this.getY() + this.getYSpeed());
        return this;
    }
}
