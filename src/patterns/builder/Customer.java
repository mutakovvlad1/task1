package patterns.builder;

public final class Customer {

    private final Status status;
    private final String name;
    private final ResponsibilitiesOrdinaryAccount responsibilitiesOrdinaryAccount;
    private final ResponsibilitiesVipAccount responsibilitiesVipAccount;

    private Customer(Builder builder) {
        this.status = builder.status;
        this.name = builder.name;
        this.responsibilitiesOrdinaryAccount = builder.responsibilitiesOrdinaryAccount;
        this.responsibilitiesVipAccount = builder.responsibilitiesVipAccount;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("This is a ")
                .append(status)
                .append(" account named ")
                .append(name);
        if (responsibilitiesOrdinaryAccount != null) {
            sb.append(" and it allows to ").append(responsibilitiesOrdinaryAccount);
        }
        if (responsibilitiesVipAccount != null) {
            sb.append(" and it allows to ").append(responsibilitiesVipAccount);
        }
        return sb.toString();
    }

    public static class Builder {

        private final Status status;
        private final String name;
        private ResponsibilitiesOrdinaryAccount responsibilitiesOrdinaryAccount;
        private ResponsibilitiesVipAccount responsibilitiesVipAccount;

        public Builder(Status profession, String name) {
            this.status = profession;
            this.name = name;
        }

        public Builder withResponsibilitiesOrdinaryAccount(ResponsibilitiesOrdinaryAccount responsibilitiesOrdinaryAccount) {
            this.responsibilitiesOrdinaryAccount = responsibilitiesOrdinaryAccount;
            return this;
        }

        public Builder withResponsibilitiesVipAccount(ResponsibilitiesVipAccount responsibilitiesVipAccount) {
            this.responsibilitiesVipAccount = responsibilitiesVipAccount;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
