package patterns.builder;

public enum Status {

    VIP, ORDINARY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}