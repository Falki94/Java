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
public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint[] mpArray = new MyPoint[10];
        for (int i = 1; i < 11; i++) {
            mpArray[i - 1] = new MyPoint(i, i);
        }
    }
}
