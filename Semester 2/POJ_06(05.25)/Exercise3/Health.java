/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

/**
 *
 * @author Falki
 */
public class Health extends Insurance {

    public Health(String insuranceType) {
        super(insuranceType);
        setCost();
    }

    public void setCost() {
        this.monthlyPrice = 196;
    }

    public void display() {
        System.out.println("InsuranceType: " + getInsuranceType() + "\nMonthly Price: " + getMonthlyPrice());
    }
}
