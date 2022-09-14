public class Main {
    public static void main(String[] args) {

        Account salaryAccount = new Account();
        Account savingAccount = new Account(1000.0);

        salaryAccount.deposit(100.0);
        savingAccount.deposit(200.0);

        Double money = salaryAccount.withdraw(50);
        System.out.println(money);

        System.out.println(salaryAccount.getBalance());
        System.out.println(savingAccount.getBalance());

    }
}