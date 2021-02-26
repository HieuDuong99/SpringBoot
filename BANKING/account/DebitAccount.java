package BANKING.account;

public class DebitAccount extends Account {

    public DebitAccount(int cardId, String id, String name, long balance) {
        super(cardId, id, name, balance);
    }
    public void display(){
        System.out.println(" Card Type : Debit Card");
        System.out.println("Card ID: " + this.cardId);
        System.out.println("Owner ID: " + this.Userid);
        System.out.println("Owner name: " + this.name);
        System.out.println("Balance: " + this.balance);
    }

    @Override
    public int getcardId() {
        return 0;
    }

    @Override
    public double monthlyInterest() {
        return 0;
    }
}
