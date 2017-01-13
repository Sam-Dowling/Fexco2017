
public class ProbabilityChecker {
    private int score = 0;

    private void TotalCost(Account account){
        this.BalanceScore(account.getBalance());
        this.EmploymentScore(account.isEmployed());
        this.CreditHistoryScore(account.getCreditHistory());
    }

    private void BalanceScore(float balance){ // 0 - 25%
        // maps balance from 0 - 100,000 over 0 - 25
        // eg balance 45,000 will give 11.25% / 25%
        this.score += Math.round(balance * 25 / 100000);
    }

    private void EmploymentScore(boolean employed){ // 0-25%
        if(employed)
            this.score += 25;
    }

    private void CreditHistoryScore(float creditHistory){ // 0-50%
        this.score += creditHistory*50;
    }

    public int getScore(){
        return this.score;
    }

}
