package patterns.builder;

public class Main {

    public static void main(String[] args) {
        Customer customerVip = new Customer.Builder(Status.VIP, "Mike")
                .withResponsibilitiesVipAccount(ResponsibilitiesVipAccount.CREATE_COLLECTIONS)
                .build();
        System.out.println(customerVip.toString());

        Customer customerOrdinary = new Customer.Builder(Status.ORDINARY, "Pole")
                .withResponsibilitiesOrdinaryAccount(ResponsibilitiesOrdinaryAccount.WHATCH_A_MOVIE)
                .build();
        System.out.println(customerOrdinary.toString());
    }
}