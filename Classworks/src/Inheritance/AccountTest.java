package Inheritance;

public class AccountTest {
    public static void main(String[] args){
        Account a=new Account();
        a.deposit();
        a.withdraw();

        SavingAccount s=new SavingAccount();
        s.deposit();
        s.withdraw();
        s.calcInterest();

        FixedAccount f=new FixedAccount();
        f.deposit();
        f.withdraw();
        f.getTerms();

    }
}
