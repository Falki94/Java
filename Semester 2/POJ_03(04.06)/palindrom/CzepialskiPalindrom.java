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
public class CzepialskiPalindrom {
        public static void main(String[] args) {
        CzepialskiPalindrom p = new CzepialskiPalindrom();
        System.out.println(p.isCzepialskiPalindrom("Atak kata"));
        System.out.println(p.isCzepialskiPalindrom("Atak Muzo, raz daj jad na rozum"));
        System.out.println(p.isCzepialskiPalindrom("Wódy żal dla żydów"));

    }
        private boolean isCzepialskiPalindrom(String x){
            x=x.toLowerCase();
            StringBuilder sb = new StringBuilder();
            StringBuilder reversedsb = new StringBuilder();
            for (int i=x.length()-1;i>x.length()/2;i--){
                reversedsb.append(i);
            }
            for (int i=0;i<x.length()/2;i++){
                sb.append(i);
            }
            return reversedsb.equals(sb);
        }
}
