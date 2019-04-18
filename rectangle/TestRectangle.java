/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author Falki
 */
public class TestRectangle {
    public static void main(String[] args){
          Rectangle r = new Rectangle(6,3);
          System.out.println(r.countPerimeter());
          System.out.println(r.countSquare());
          System.out.println(r.countDiagonal());
    }
}
