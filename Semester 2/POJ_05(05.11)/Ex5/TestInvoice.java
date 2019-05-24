/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lubieplacki;

/**
 *
 * @author Falki 
*/
public class TestInvoice {

    public static void main(String[] args) {
        Invoice inv = new Invoice(1, new Customer(1, "Andrzej", 10), 100);
        System.out.println(inv.getAmountAfterDiscount());
    }
}
