package patterns.builder;

public enum ResponsibilitiesVipAccount {

    CREATE_COLLECTIONS ("create collections"), CHANGE_CONTENT("change content");

    ResponsibilitiesVipAccount(String title) {
        this.title = title;
    }

    private final String title;
    @Override
    public String toString() {
        return title;
    }
}