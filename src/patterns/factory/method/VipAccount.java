package patterns.factory.method;

class VipAccount extends Account {
    public VipAccount() {
        status = "VIP-account";
        opportunities.add("creating collections");
        opportunities.add("content sharing");
        opportunities.add("access to paid content");
        opportunities.add("the ability to connect additional devices");
    }
}