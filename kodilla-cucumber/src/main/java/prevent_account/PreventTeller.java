package prevent_account;

import display_account.*;

public class PreventTeller {
    //private DisplayCashSlot displayCashSlot;
    private DisplayAccount displayAccount;
    //private DisplayUser displayUser;
    private ProvideUser provideUser;
    private DisplayWithdrawSlot displayWithdrawSlot;

    public PreventTeller(ProvideUser provideUser, DisplayAccount displayAccount, DisplayWithdrawSlot displayWithdrawSlot) {
        this.provideUser = provideUser;
        this.displayAccount = displayAccount;
        this.displayWithdrawSlot = displayWithdrawSlot;
    }

    public void getMoney(int amount, String name) {
        if(displayAccount.getBalance() > amount) {
            displayWithdrawSlot.dispenseCash(0);
            //displayAccount.debit(0, name);
        } else {
            displayWithdrawSlot.dispenseCash(amount);
            //displayAccount.debit(amount, name);
        }
    }

    public String showAmountCredited() {
        return "Customer " + provideUser.getUserName() + " credited account with $"
                + displayAccount.getBalance();
    }

    public String withdrawAmount() {
        return "Customer "+ provideUser.getUserName() + " try to withdraw $" + displayWithdrawSlot.getCash();
    }

    public String information() {
        if(displayAccount.getBalance() - displayWithdrawSlot.getCash() <= 0) {
            return "Customer " + provideUser.getUserName() + " should be told that he has insufficient balance";
        } else {
            return "Customer " + provideUser.getUserName() + " balance is $" + displayAccount.getBalance();
        }
    }

//    public String checkBalance() {
//        return "Customer " + provideUser.getUserName() + " checks balance";
//    }
//
//    public String showBalance() {
//        return "Customer " + provideUser.getUserName() + " should see account balance $"
//                + displayAccount.getBalance();
//    }
}
