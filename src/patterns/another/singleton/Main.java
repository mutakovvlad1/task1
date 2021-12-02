package patterns.another.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.employee = "Mike";
        System.out.println("The customer's name is " + singleton.employee);
    }
}

