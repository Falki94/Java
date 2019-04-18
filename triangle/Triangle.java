/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Falki
 */
public class Triangle {

    private double A;
    private double B;
    private double C;

    public Triangle(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public double countPerimeter(){
        return this.A+this.B+this.C;
    }
    public double countSquare(){
        double p = countPerimeter()/2;
        return Math.sqrt(p*(p-A)*(p-B)*(p-C));
    }

    public boolean isEquilateral(){
        return A==B && A==C;
    }
    public boolean isIsosceles(){
        return A==B || A==C || B==C;
    }
    
    public boolean isScalene(){
         return !isEquilateral();
    }
}
