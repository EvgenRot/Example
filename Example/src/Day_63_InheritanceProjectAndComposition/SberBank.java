package Day_63_InheritanceProjectAndComposition;

public class SberBank extends CentralBank {

    public SberBank(String bankName) {
        super(bankName);
    }

    @Override
    public void deposit_impl(BankAccount person, double depositValue) {
        if (depositValue < 3000){
            person.deposit(depositValue);
            System.out.println("Счет " + person.getAccountID() + " пополнен на сумму " + depositValue + ", Текущий " +
                    "баланс счета : " + person.getCurrentBalance());
        }else {
            person.deposit(depositValue + person.getDepositBonus());
            System.out.println("Счет " + person.getAccountID() + " пополнен на сумму " + depositValue + " и бонус " +
                    "пополнения " + person.getDepositBonus() + " , Текущий баланс счета: " + person.getCurrentBalance());
        }
    }

    @Override
    public boolean withdraw_impl(BankAccount person, double withdrawValue) {
        if(withdrawValue > person.getCurrentBalance()){
            System.out.println("Not enough money to withdraw cash!");
            return false;
        }
        if (withdrawValue < 2000){
            person.withdraw(withdrawValue);
            System.out.println("Со счета " + person.getAccountID() + " списана сумма " +
                    withdrawValue + " , Текущий баланс счета: " + person.getCurrentBalance());
        }else {
            double finalWithdrawValue = Math.min(person.getCurrentBalance(),
                    withdrawValue + person.getWithdrawExpense());
            person.withdraw(finalWithdrawValue);
            System.out.println("Со счета " + person.getAccountID() + " списана сумма " +
                    (finalWithdrawValue - person.getWithdrawExpense()) + " и ваш расход снятия " +
                    person.getWithdrawExpense() + " , Текущий баланс счета: " + person.getCurrentBalance());
        }
        return true;
    }

    @Override
    public void setupUserAccountType_impl(BankAccount person) {
        switch (person.getAccountType()) {
            case "GOLD":
                person.setDepositBonus(80);
                person.setWithdrawExpense(90);
                person.setReturnRate(1.4);
                break;
            case "SAVING":
                person.setDepositBonus(90);
                person.setWithdrawExpense(70);
                person.setReturnRate(1.1);
                break;
            case "INTEREST":
                person.setDepositBonus(100);
                person.setWithdrawExpense(80);
                person.setReturnRate(1.2);
                break;
            default:
                System.out.println("!!!! НЕДЕЙСТВИТЕЛЬНЫЙ ТИП СЧЕТА!!!");
        }
    }
}