package bridge.internetBanking;

import adapter.SimpleClient;
import bridge.AbstractAccount;
import bridge.InternetBanking;

public class TurkishBankInternetBanking implements InternetBanking {
    @Override
    public void showAccount(SimpleClient client) {
        System.out.println("Welcome to Turkish Bank Internet Banking");
        System.out.println(client.getFullName() + " current balnce is: " + client.getAccount());
    }
}
