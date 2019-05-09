/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

/**
 *
 * @author Falki
 */
public class Staff extends Person {
    private String school;
    private double pay;
    
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.setSchool(school);
        this.school=school;
        this.setPay(pay);
    }
  
    public String getSchool(){
        return school;
    }
    public double getPay(){
        return pay;
    }
    public void setSchool(String school){
        this.school=school;
        
    }
    public void setPay(double pay){
        this.pay=pay;
    }
    
    public String toString() {
        return "Staff{"+"Person[name="+getName()+", address="+ getAddress() + ", school=" + school + ", pay=" + pay + '}';
    }
    

}
