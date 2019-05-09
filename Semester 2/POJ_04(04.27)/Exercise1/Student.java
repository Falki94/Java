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
public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.setProgram(program);
        this.setYear(year);
        this.setFee(fee);
    }
    public String getProgram(){
        return program;
    }
    public int getYear(){
        return year;
    }
    public double getFee(){
        return fee;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setFee(double fee){
        this.fee=fee;
    }

    public String toString() {
        return "Student{" + "Person name="+ getName() + ", address="+ getAddress() +", program=" + program + ", year=" + year + ", fee=" + fee + '}';
    }
    
}
