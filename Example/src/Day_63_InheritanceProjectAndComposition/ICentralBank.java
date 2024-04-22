package Day_63_InheritanceProjectAndComposition;

public interface ICentralBank {

    void deposit_impl(BankAccount person, double depositValue);

    boolean withdraw_impl(BankAccount person, double withdrawValue);

    void setupUserAccountType_impl(BankAccount person);
}
