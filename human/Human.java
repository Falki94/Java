/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human;

/**
 *
 * @author Falki
 */
public class Human {

    private int id;
    private int age;
    private double weight;
    private double height;
    private String name;
    private double feetsize;
    private Gender gender;

    enum Gender {
        MALE, FEMALE;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double feetsize() {
        return feetsize;
    }

    public void setFeetSize(double feetsize) {
        this.feetsize = feetsize;
    }

    public boolean isMale(){
        return this.gender==Gender.MALE;
    }
    public void setGender(Gender gender){
        this.gender=gender;
    }
    public String toString() {
        return "Human[" + "id = " + id + ", age = " + age + ", weight = " + weight + ", height = " + height + ", name = " + name + ", feetsize = " + feetsize + ", gender = " + gender + "]";
    }

}
