package patterns.factory.method;

class VipAccountFactory extends AccountFactory {
    public Account createAccount() {
        return new VipAccount();
    }
}