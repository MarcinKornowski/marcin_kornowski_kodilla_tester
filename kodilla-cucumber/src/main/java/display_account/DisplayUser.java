package display_account;

public class DisplayUser {
    private ProvideUser provideUser;

    public DisplayUser(ProvideUser provideUser) {

        this.provideUser = provideUser;
    }

    public void showName(String name) {

        provideUser.dispenseName(name);
    }

}
