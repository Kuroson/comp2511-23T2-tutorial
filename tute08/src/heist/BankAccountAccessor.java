package heist;

/**
 * A single access to a bank account.
 * 
 * @author Nick Patrikeos + @your name
 */
public class BankAccountAccessor {
    private BankAccount account;
    private static BankAccountAccessor instance;

    private BankAccountAccessor(BankAccount account) {
        this.account = account;
    }

    public synchronized static BankAccountAccessor getInstance(BankAccount account) {
        if (BankAccountAccessor.instance != null) {
            return BankAccountAccessor.instance;
        } else {
            BankAccountAccessor.instance = new BankAccountAccessor(account);
        }
        return BankAccountAccessor.instance;
    }

    public void withdraw(String user, int numberOfWithdrawals, int amountPerWithdrawal) {
        System.out.println(user + " is accessing the bank.");

        for (int i = 0; i < numberOfWithdrawals; i++) {
            if (account.withdraw(amountPerWithdrawal)) {
                System.out.println(user + " successfully withdrew $" + amountPerWithdrawal);
            } else {
                System.out.println(user + " failed to withdraw $" + amountPerWithdrawal + ".");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(user + " is leaving the bank, the balance is $" + account.getBalance());
    }

}