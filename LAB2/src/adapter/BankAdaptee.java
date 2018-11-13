package adapter;

public class BankAdaptee {
    void fillAccountWithBank(SimpleClient client, int amount) {
        int commissionFill = 10;
        int realAmount = amount - commissionFill;
        int newValue = client.getAccount() + realAmount;
        client.setAccount(newValue);
        System.out.println("Bank balance for " + client.getFullName() + " after fill with Bank is " + client.getAccount());
    }
    void transferWithBank(SimpleClient client, int amount) {
        int commissionTransfer = 10;
        int realAmount = amount + commissionTransfer;
        int newValue = client.getAccount() - realAmount;
        client.setAccount(newValue);
        System.out.println("Bank balance for " + client.getFullName() + " after transfer with Bank is " + client.getAccount());
    }

    void withdrawWithBank(SimpleClient client, int amount) {
        int commissionWithdraw = 10;
        int realAmount = amount + commissionWithdraw;
        int newValue = client.getAccount() - realAmount;
        client.setAccount(newValue);
        System.out.println("Bank balance for " + client.getFullName() + " after withdraw with Bank is " + client.getAccount());
    }
}
