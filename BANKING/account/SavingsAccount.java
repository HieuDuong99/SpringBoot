package BANKING.account;

public class SavingsAccount extends Account {
    public double interestRate;

    public SavingsAccount(int cardId, String Userid, String name, long balance, double interestRate) {
        super(cardId, Userid, name, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void display() {
        System.out.println("Type: Savings Account");
        super.display();
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Current Interest: " + monthlyInterest());
        System.out.println();
    }

    @Override
    public int getcardId() {
        return 0;
    }

    @Override
    public double monthlyInterest() {
        return balance * interestRate / 12;
    }
}
