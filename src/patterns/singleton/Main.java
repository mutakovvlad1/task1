package patterns.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singletonEnum = Singleton.CUSTOMER;
        System.out.println("The customer's name is " + singletonEnum.hello());
    }
}
