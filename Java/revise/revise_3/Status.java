package preparation.revise_3;

public enum Status {

    ACTIVE("Active User"),
    INACTIVE("Inactive User");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
