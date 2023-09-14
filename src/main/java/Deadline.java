public class Deadline extends Task {
    private String by;
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String getFormattedTask() {
        return "[D] " + super.getFormattedTask() + " (by: " + by  + ")";
    }
}
