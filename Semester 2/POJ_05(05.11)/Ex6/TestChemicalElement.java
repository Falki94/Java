/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemistry;

/**
 *
 * @author Falki
 */
public class TestChemicalElement {
    public static void main(String[] args){
        ChemicalElement element = new ChemicalElement();
        element.setName("Zinc");
        element.setSymbol("Zn");
        element.setAtomicNumber(30);
        System.out.println(element.isTransition());
        System.out.println(element.isAlkali());
        System.out.println(element.isMetal());
    }
}
