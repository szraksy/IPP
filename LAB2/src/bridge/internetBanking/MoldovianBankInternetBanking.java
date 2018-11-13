package bridge.internetBanking;

import adapter.SimpleClient;
import bridge.AbstractAccount;
import bridge.InternetBanking;

public class MoldovianBankInternetBanking implements InternetBanking {
    @Override
    public void showAccount(SimpleClient client) {
        System.out.println("Welcome to Moldovian Bank Internet Banking");
        System.out.println(client.getFullName() + " current balnce is: " + client.getAccount());
    }
}
