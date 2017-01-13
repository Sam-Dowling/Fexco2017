
public class BankAccount implements Account{
    private String name;
    private float balance,creditHistory;
    private boolean employed;

    public BankAccount(String name, float balance, float creditHistory, boolean employed) {
        this.name = name;
        this.balance = balance;
        this.creditHistory = creditHistory;
        this.employed = employed;
    }

    @Override
    public float getBalance() {
        return balance;
    }

    @Override
    public boolean isEmployed() {
        return employed;
    }

    @Override
    public float getCreditHistory() {
        return creditHistory;
    }
}
