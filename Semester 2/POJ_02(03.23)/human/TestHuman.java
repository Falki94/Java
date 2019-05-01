package human;

import static human.Human.Gender;

public class TestHuman {
    public static void main(String[] args){
        Human h = new Human();
        h.setId(1);
        h.setAge(25);
        h.setFeetSize(8);
        h.setHeight(185);
        h.setWeight(75);
        h.setName("Maciej");
        h.setGender(Gender.FEMALE);
        System.out.println(h.toString());
    }
}
