package Day_63_InheritanceProjectAndComposition;

public class CityGroup extends CentralBank{

    public CityGroup(String bankName) {
        super(bankName);
    }

    @Override
    public void deposit_impl(BankAccount person, double depositValue) {
        if (depositValue < 2000){
            person.deposit(depositValue);
            System.out.println("Вы пополнили свой счет на сумму " + depositValue + ", ваш текущий " +
                    "счет " + person.getCurrentBalance());
        }else {
            person.deposit(depositValue + person.getDepositBonus());
            System.out.println("Вы пополнили свой счет на сумму " + depositValue + " и ваш бонус пополнения " +
                    "больше или равно 2000, " + person.getDepositBonus() +
                    " , ваш текущий счет " + person.getCurrentBalance());
        }
    }

    @Override
    public boolean withdraw_impl(BankAccount person, double withdrawValue) {
        if(withdrawValue > person.getCurrentBalance()){
            System.out.println("Not enough money to withdraw cash!");
            return false;
        }
        if (withdrawValue < 1000){
            person.withdraw(withdrawValue);
            System.out.println("Вы сняли со своего счета сумму " + withdrawValue + ", ваш текущий " +
                    "счет " + person.getCurrentBalance());
        }else {
            double finalWithdrawValue = Math.min(person.getCurrentBalance(),
                    withdrawValue + person.getWithdrawExpense());
            person.withdraw(finalWithdrawValue);
            System.out.println("Вы сняли со своего счета сумму " + (finalWithdrawValue - person.getWithdrawExpense()) + " и ваш расход снятия " +
                    person.getWithdrawExpense() + " , ваш текущий счет " + person.getCurrentBalance());
        }
        return true;
    }

    @Override
    public void setupUserAccountType_impl(BankAccount person) {
        switch (person.getAccountType()){
            case "GOLD":
                person.setDepositBonus(80);
                person.setWithdrawExpense(70);
                person.setReturnRate(1.3);
                break;
            case "SAVING":
                person.setDepositBonus(90);
                person.setWithdrawExpense(60);
                person.setReturnRate(1.2);
                break;
            case "INTEREST":
                person.setDepositBonus(100);
                person.setWithdrawExpense(50);
                person.setReturnRate(1.1);
                break;
            default:
                System.out.println("!!!! НЕДЕЙСТВИТЕЛЬНЫЙ ТИП СЧЕТА!!!");
        }
    }
}