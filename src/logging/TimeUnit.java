package logging;

public enum TimeUnit {
    SEC("Sec", 1000000000.0),
    MILI("Mili", 1000000.0),
    MICRO("Micro", 1000.0),
    NANO("Nano", 1.0);

    public final String key;
    public final double value;

    TimeUnit(String key, double value) {
        this.key = key;
        this.value = value;
    }
}
