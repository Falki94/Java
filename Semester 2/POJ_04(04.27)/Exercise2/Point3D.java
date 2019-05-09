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
public class Point3D extends Point2D {

    private float z = 0.0f;
    private float[] axisXYZ;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.setZ(z);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.getZ()};
    }

    public void setXYZ(float[] xyz) {
        this.axisXYZ = xyz;
    }

    public String toString() {
        return "Point3D{" + getXYZ()[0] + ", " + getXYZ()[1] + ", " + getXYZ()[2] + '}';
    }
}
