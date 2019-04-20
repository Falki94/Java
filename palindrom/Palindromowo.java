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
public class Palindromowo {

    public static void main(String[] args) {
        Palindromowo p = new Palindromowo();
        System.out.println(p.isPalindromowo("Atak kata"));
        System.out.println(p.isPalindromowo("Muzo, raz daj jad za rozum"));
        System.out.println(p.isPalindromowo("Wódy żal dla żydów"));
    }

    private boolean isPalindromowo(String x) {
        x=x.toLowerCase();
        for (int i=0,j=x.length()-1;i<=x.length()/2;i++,j--){
            if (x.charAt(i)!=x.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
