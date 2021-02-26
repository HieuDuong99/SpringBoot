package BANKING.account;

public class CreditAccount extends Account {
    private long creditLimit;
    private long creditAmount = 0;

    public CreditAccount(int cardId, String id, String name, long creditLimit) {
        super(cardId, id, name, 0);
    }

    public long getCreditAmount() {
        return creditAmount;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void display() {
        System.out.println("Type: Credit Account");
        super.display();
        System.out.println("Credit limit: " + this.creditLimit);
        System.out.println("Credit amount: " + this.creditAmount);
        System.out.println();
    }

    @Override
    public int getcardId() {
        return 0;
    }

    @Override
    public void withdraw(long amount) {
        try {
            if (amount + creditAmount > creditLimit) {
                throw new IllegalArgumentException("Vuot qua han muc tin dung");
            } else {
                creditAmount += amount;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double monthlyInterest() {
        return 0;
    }
}
