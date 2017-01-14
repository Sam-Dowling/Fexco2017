
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

    float calculateLoanAmount(float loanAmount, String loanType){
        float loanTypefactor = 1;
        switch(loanType){
            case "Car Loan":
                loanTypefactor = 1.05f;
                break;
            case "Mortgage":
                loanTypefactor = 1.20f;
                break;
            case "Business Loan":
                loanTypefactor = 1.10f;
                break;
        }
        return this.loanProbability.loanCost(loanAmount) * loanTypefactor;
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
