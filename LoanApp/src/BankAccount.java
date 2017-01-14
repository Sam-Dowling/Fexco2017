
public class BankAccount implements Account{
    private String name;
    private float balance,creditHistory;
    private boolean employed;
    private ProbabilityChecker loanProbability;

    BankAccount(String name, float balance, float creditHistory, boolean employed) {
        this.name = name;
        this.balance = balance;
        this.creditHistory = creditHistory;
        this.employed = employed;
        this.loanProbability = new ProbabilityChecker(this);
    }

    public float calculateLoanAmount(float loanAmount){
        return this.loanProbability.loanCost(loanAmount);
    }

    public int getScore(){
        return this.loanProbability.getScore();
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
