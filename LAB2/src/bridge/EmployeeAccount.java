package bridge;

import adapter.SimpleClient;

public class EmployeeAccount extends AbstractAccount {
    private SimpleClient client;
    public EmployeeAccount(InternetBanking internetBanking, SimpleClient client) {
        super(internetBanking);
        this.client = client;
    }

    @Override
    public void show() {
        internetBanking.showAccount(client);
    }

}
