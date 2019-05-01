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
public class TestTriangle {
    public static void main(String[] args){
        Triangle t = new Triangle(3,4,5);
        System.out.println(t.countPerimeter());
        System.out.println(t.countSquare());
        System.out.println(t.isEquilateral());
        System.out.println(t.isIsosceles());
        System.out.println(t.isScalene());
    }
}
