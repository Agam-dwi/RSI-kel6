import java.util.ArrayList;

public class SkillConnectService {
    private ArrayList<User> users;
    private ArrayList<Ticket> tickets;

    public SkillConnectService() {
        users = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public Ticket createTicket(User user, String issue, String itemType, String location, boolean isUrgent) {
        Ticket newTicket = new Ticket(user, issue, itemType, location, isUrgent);
        tickets.add(newTicket);
        return newTicket;
    }

    public ArrayList<Ticket> getUrgentTickets() {
        ArrayList<Ticket> urgentTickets = new ArrayList<>();
        for (Ticket ticket : tickets) {
            if (ticket.isUrgent()) {
                urgentTickets.add(ticket);
            }
        }
        return urgentTickets;
    }
}
