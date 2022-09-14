public class Account {
    private double balance;
    private String name;

    private static int count = 0;  //Static är för alla i klassen


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account() { //konstruktören heter alltid samma som klassen
        this.balance = 0.0;
        this.count++;
    }



    public Account(double startbalance) {
        this.balance = startbalance;
        this.count++;
    }



    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount) {  //Hur mycket pengar ska sättas in
        this.balance += amount;
       // balance = balance + amount;
    }

    public double withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
            return amount;

        }
         return 0;

    }


}
