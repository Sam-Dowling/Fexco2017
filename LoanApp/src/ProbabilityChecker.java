
public class ProbabilityChecker {
    private int score = 0;

    ProbabilityChecker(Account account) {
        this.balanceScore(account.getBalance());
        this.employmentScore(account.isEmployed());
        this.creditHistoryScore(account.getCreditHistory());
    }

    private void balanceScore(float balance){ // 0 - 25%
        // maps balance from 0 - 80,000 over 0 - 25
        // eg balance 45,000 will give 14% / 25%
        this.score += map(balance, 0, 80000, 0, 25);
    }

    private void employmentScore(boolean employed){ // 0-25%
        if(employed)
            this.score += 25;
    }

    private void creditHistoryScore(float creditHistory){ // 0-50%
        this.score += creditHistory*50;
    }

    public int getScore(){
        return (this.score <= 100) ? this.score : 100;
    }

    public float loanCost(float loanAmount){
        return loanAmount * map(this.getScore(), 0, 100,1.50f , 1.05f);
    }

    private float map(float x, float in_min, float in_max, float out_min, float out_max) {
        return Math.round(x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
    }

}
