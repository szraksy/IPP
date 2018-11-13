package adapter;

public class BankAdapter implements OperationInterface {
    private BankAdaptee bank;
    public BankAdapter(BankAdaptee bank) {
        this.bank = bank;
    }
    @Override
    public void fill(SimpleClient client, int amount) {
        bank.fillAccountWithBank(client, amount);
    }

    @Override
    public void transfer(SimpleClient client, int amount) {
        bank.transferWithBank(client, amount);
    }

    @Override
    public void withdraw(SimpleClient client, int amount) {
        bank.withdrawWithBank(client, amount);
    }

}
