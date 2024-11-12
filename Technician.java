public class Technician extends User {
    private String[] skills;
    private String[] certificates;

    public Technician(String username, String password, String whatsAppNumber, String[] skills, String[] certificates) {
        super(username, password, whatsAppNumber);
        this.skills = skills;
        this.certificates = certificates;
    }

    public void acceptTicket(Ticket ticket) {
        ticket.setStatus("Accepted by Technician");
    }

    public void declineTicket(Ticket ticket) {
        ticket.setStatus("Declined by Technician");
    }
}
