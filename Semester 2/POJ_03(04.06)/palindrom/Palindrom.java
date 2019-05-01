/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

/**
 *
 * @author Falki
 */
public class Palindrom {
    public static void main (String[] args){
        Palindrom p = new Palindrom();
        System.out.println(p.isPalindrom("Atak kata"));
        System.out.println(p.isPalindrom("Atak Muzo, raz daj jad na rozum"));
        System.out.println(p.isPalindrom("Wody zal dla zydow"));
    }
    private boolean isPalindrom(String x){
        x=x.toLowerCase();
        StringBuilder sb = new StringBuilder(x);
        return sb.reverse().toString().split(",").equals(x);
    }
}