public abstract class User {
    protected String username;
    protected String password;
    protected String whatsAppNumber;

    public User(String username, String password, String whatsAppNumber) {
        this.username = username;
        this.password = password;
        this.whatsAppNumber = whatsAppNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getWhatsAppNumber() {
        return whatsAppNumber;
    }
    
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void logout() {
        System.out.println("User logged out.");
    }
}
