
public class BankAccount implements Account{
    private String name;
    private float balance,creditHistory;
    private boolean employed;
    public ProbabilityChecker loanProbability;

    public BankAccount(String name, float balance, float creditHistory, boolean employed) {
        this.name = name;
        this.balance = balance;
        this.creditHistory = creditHistory;
        this.employed = employed;
        this.loanProbability = new ProbabilityChecker(this);
    }


    public float getBalance() {
        return balance;
    }


    public boolean isEmployed() {
        return employed;
    }


    public float getCreditHistory() {
        return creditHistory;
    }
}
