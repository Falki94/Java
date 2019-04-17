    package account;

public class TestAccount {
    public static void main(String[] args){
        Account a1 = new Account("acc12345", "Account1");
        System.out.println("Account ID: " + a1.getId() + "\nAccount Name: "+ a1.getName());
        Account a2 = new Account("acc54321", "Account2",1000000);
        System.out.println("Account ID: " + a2.getId() + "\nAccount Name: "+ a2.getName() + "\nAccount Balance: "+ a2.getBalance());
    }
}
