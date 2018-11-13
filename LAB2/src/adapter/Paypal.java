package adapter;

public class Paypal implements OperationInterface {
    @Override
    public void fill(SimpleClient client, int amount) {
        int commissionFill = 5;
        int realAmount = amount - commissionFill;
        int newValue = client.getAccount() + realAmount;
        client.setAccount(newValue);
        System.out.println("Paypal balance for " + client.getFullName() + " after fill with Paypal is " + client.getAccount());
    }

    @Override
    public void transfer(SimpleClient client, int amount) {
        int commissionTransfer = 5;
        int realAmount = amount + commissionTransfer;
        int newValue = client.getAccount() - realAmount;
        client.setAccount(newValue);
        System.out.println("Paypal balance for " + client.getFullName() + " after transfer with Paypal is " + client.getAccount());

    }

    @Override
    public void withdraw(SimpleClient client, int amount) {
        int commissionWithdraw = 5;
        int realAmount = amount + commissionWithdraw;
        int newValue = client.getAccount() - realAmount;
        client.setAccount(newValue);
        System.out.println("Paypal balance for " + client.getFullName() + " after withdraw with Paypal is " + client.getAccount());

    }
}
