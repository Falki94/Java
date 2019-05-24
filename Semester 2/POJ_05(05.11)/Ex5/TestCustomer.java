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
public class TestCustomer {
    public static void main(String[] args){
        Customer client = new Customer(1,"Andrzej",10);
        System.out.println(client.toString());
    }
}
