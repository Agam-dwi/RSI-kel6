public class Ticket {
    private String id;
    private User user;
    private Technician technician;
    private String issue;
    private String itemType;
    private String location;
    private String status;
    private boolean isUrgent;

    public Ticket(User user, String issue, String itemType, String location, boolean isUrgent) {
        this.user = user;
        this.issue = issue;
        this.itemType = itemType;
        this.location = location;
        this.isUrgent = isUrgent;
        this.status = "Pending";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isUrgent() {
        return isUrgent;
    }
}
