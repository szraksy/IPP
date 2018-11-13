package adapter;

public class SimpleClient {
    private int account;
    private String fullName;

    public SimpleClient(String fullName, int money) {
        this.account = money;
        this.fullName = fullName;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAccount() {
        return account;
    }

    public String getFullName() {
        return fullName;
    }
}
