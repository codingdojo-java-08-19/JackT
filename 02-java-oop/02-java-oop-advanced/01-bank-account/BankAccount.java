import java.util.ArrayList;
import java.util.Random;

public class BankAccount{
    private String accountNumber;
    private Double checkingBalance = 0.0;
    private Double savingBalance = 0.0;
    private static int accounts = 0;
    private static Double totalMoney = 0.0;

    private String randoAccNum(){
        Random num = new Random();
        StringBuilder accnum = new StringBuilder();
        for(int i =0; i<10; i++){
            accnum.append(num.nextInt(10));
        }
        String string = accnum.toString();
        return string;
    }

    public BankAccount(){
        accountNumber=randoAccNum();
        accounts++;
    }
    public Double getChecking(){
        return this.checkingBalance;
    }
    public Double getSavings(){
        return this.savingBalance;
    }
    public void deposit(Double money, int account){
        if(account == 1){
            this.checkingBalance += money;
        }
        else if(account == 2){
            this.savingBalance += money;
        }
    }

    public void withdraw(Double money, int account){
        if(account == 1){
            this.checkingBalance -= money;
        }
        else if(account == 2){
            this.savingBalance -= money;
        }
    }

    public Double totalBalance(){
        return savingBalance+checkingBalance;
    }
}