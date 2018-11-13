package bridge;

import adapter.SimpleClient;

public abstract class AbstractAccount {
    protected InternetBanking internetBanking;

    protected AbstractAccount(InternetBanking internetBanking){
        this.internetBanking = internetBanking;
    }
    public abstract void show();
}
