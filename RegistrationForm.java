import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField whatsappField;
    private JButton registerButton;
    

    public RegistrationForm() {
        setTitle("Registrasi SkillConnect");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        // Komponen GUI
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        whatsappField = new JTextField(20);
        registerButton = new JButton("Register");

        // Panel Form
        JPanel panel = new JPanel();
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel("WhatsApp:"));
        panel.add(whatsappField);
        panel.add(registerButton);

        add(panel);

        // Aksi pada tombol Register
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String whatsapp = whatsappField.getText();

                // Validasi input
                if (username.isEmpty() || password.isEmpty() || whatsapp.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom harus diisi!");
                    return;
                }

                // Membuat objek User dan menyimpannya ke database
                User user = new User(username, password, whatsapp);
                userDAO.addUser(user);

                JOptionPane.showMessageDialog(null, "Registrasi Berhasil!");
                clearForm();
            }
        });
    }

    private void clearForm() {
        usernameField.setText("");
        passwordField.setText("");
        whatsappField.setText("");
    }

    public static void main(String[] args) {
        new RegistrationForm().setVisible(true);
    }
}
