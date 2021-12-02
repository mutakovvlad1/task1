package patterns.factory.method;

import java.util.ArrayList;
import java.util.List;

public class Main {

    String status;
    List<String> opportunities = new ArrayList();

    public String toString() {
        return "Account status: " + status + "\n" + opportunities;
    }

    public static void main(String[] args) {
        AccountFactory myVipFactory = new VipAccountFactory();
        AccountFactory myRegularFactory = new RegularAccountFactory();

        Account myVipAccount = myVipFactory.createAccount();
        Account myRegularAccount = myRegularFactory.createAccount();

        System.out.println(myVipAccount);
        System.out.println(myRegularAccount);
    }
}