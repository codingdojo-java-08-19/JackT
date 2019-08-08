public class BankAccountTest{
    public static void main(String args[]){
        BankAccount acc = new BankAccount();
        acc.deposit(4578.96, 1);
        acc.deposit(1265.23, 2);
        acc.withdraw(400.00, 1);
        System.out.println(acc.totalBalance());
    }
}