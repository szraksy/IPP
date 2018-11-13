package adapter;

public interface OperationInterface {
    void fill(SimpleClient client, int amount);
    void transfer(SimpleClient client, int amount);
    void withdraw(SimpleClient client, int amount);
}
