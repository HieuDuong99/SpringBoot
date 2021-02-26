package BANKING.account;

public abstract class Account {
    protected int cardId;
    protected String Userid;
    protected String name;
    protected long balance;

    public Account(int cardId, String id, String name, long balance) {
        this.cardId = cardId;
        this.Userid = id;
        this.name = name;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public String getUserid() {
        return Userid;
    }

    public String getName() {
        return name;
    }

    public void setUserid(String userid) {
        this.Userid = userid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) {
        try {
            if (amount > balance - 50000) {
                throw new IllegalArgumentException("So du khong du");
            }
            balance -= amount;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public abstract double monthlyInterest();

    public void display() {

        System.out.println("Card ID: " + this.cardId);
        System.out.println("Owner ID: " + this.Userid);
        System.out.println("Owner name: " + this.name);
        System.out.println("Balance: " + this.balance);
    }

    public abstract int getcardId();
}
