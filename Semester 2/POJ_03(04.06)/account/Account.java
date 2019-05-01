package account;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    public int credit(int amount){
        this.balance=amount+balance;
        return balance;
    }
    
    public int debit(int amount){
        if (amount <= balance){
            this.balance=balance-amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account anotherAcc,int amount){
        if (amount <= balance){
            anotherAcc.credit(amount);
            debit(amount);
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", balance=" + balance + '}';
    }
    
}
