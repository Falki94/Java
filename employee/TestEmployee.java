package employee;

public class TestEmployee {
    public static void main(String[] args){
        Employee e = new Employee(0,"Andrzej", "Andrzejewski", 10000);
        System.out.println("Employee ID: " + e.getId() + "\nEmployee name: " + e.getFirstName() + "\nEmployee Surname: " + e.getLastName() + "\nSalary: "+ e.getSalary());
    }
}

