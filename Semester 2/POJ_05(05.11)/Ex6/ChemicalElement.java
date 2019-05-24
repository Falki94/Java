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
public class ChemicalElement {

    private String name;
    private String symbol;
    private int atomicNumber;

    /**
     * @param metalType the metalType to set
     */
    private void setMetalType(MetalType metalType) {
        this.metalType = metalType;
    }

    /**
     * @return the metalType
     */
    private enum MetalType {

        alkali,
        transition,
        metal
    }

    private MetalType metalType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        
        this.atomicNumber = atomicNumber;
        switch(atomicNumber){
            case 3:
            case 11:
            case 19:
            case 37:
            case 55:
            case 87:
                setMetalType(MetalType.alkali);
                break;
            case 13:
            case 49:
            case 50:
            case 81:
            case 82:
            case 83:
            case 113:
            case 114:
            case 115:
            case 116:
                setMetalType(MetalType.metal);
                break;
            default:
                if ((atomicNumber > 20 && atomicNumber<31 )|| (atomicNumber >38 && atomicNumber <49) || (atomicNumber > 71 && atomicNumber < 81 ) || atomicNumber>103 && atomicNumber <113){
                    setMetalType(MetalType.transition);
                }
        }
    }
    public boolean isAlkali(){
        return this.metalType==MetalType.alkali;
    }
    public boolean isTransition(){
        return this.metalType==MetalType.transition;
    }
    public boolean isMetal(){
        return this.metalType==MetalType.metal;
    }
}
