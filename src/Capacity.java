public enum Capacity {SMALLEST("особо малая (до 10 мест)"),
    SMALL("малая (до 25)"),
    MIDDLE("средняя (40–50)"),
    BIG("большая (60–80)"),
    BIGGEST("особо большая (100–120 мест)");
    private final String description;

    Capacity(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
