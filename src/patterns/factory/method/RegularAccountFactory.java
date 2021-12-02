package patterns.factory.method;

class RegularAccountFactory extends AccountFactory {
    public Account createAccount() {
        return new RegularAccount();
    }
}