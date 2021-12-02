package patterns.builder;

public enum ResponsibilitiesOrdinaryAccount {

    WHATCH_A_MOVIE("watch a movie"),
    LISTEN_TO_AUDIOBOOK("listen to audiobook");

    ResponsibilitiesOrdinaryAccount(String title) {
        this.title = title;
    }

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}