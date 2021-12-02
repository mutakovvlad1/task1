package patterns.factory.method;

class RegularAccount extends Account{
    public RegularAccount(){
        status = "regular account";
        opportunities.add("watching movies");
        opportunities.add("listening to audiobooks");
    }
}