import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
public class Gui extends JFrame{
    Gui(){
    super("Reality")
    setLayout(new FlowLayout());
    private JLabel lblHeading,lblUserName,lblPassword;
    private JButton btnProceed,btnExit,btnChange;
    private JTextField txtUsername;
    private JPasswordField pwdPassword;
    setVisible(true);
    setSize(350,400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JLabel lblHeading=new JLabel("LOGIN PAGE");
    JLabel lblUserName=new JLabel("Username");
    JTextField txtUsername=new JTextField("Username")
    JLabel lblPassword=new JLabel("Password");
    JPasswordField pwdPassword =new JPasswordField("Password");
    JButton btnChange=new JButton("Change");
    JButton btnProceed=new JButton("Proceed");
    JButton btnExit=new JButton("Exit");
    add(lblHeading);
    add(lblUserName);
    add(lblPassword);
    add(btnProceed)
    add(btnExit);
    add(btnChange);
    
        // ActionListener for Exit button
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = JOptionPane.showConfirmDialog(Gui.this, 
                    "Are you sure you want to terminate the program?", 
                    "Confirm Exit", 
                    JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        
        // ActionListener for Proceed button
        btnProceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(pwdPassword.getPassword());
                
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(Gui.this, 
                        "Please enter username and password", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Gui.this, 
                        "Welcome " + username + "!", 
                        "Login Successful", 
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        // ActionListener for Change button (reset fields)
        btnChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                pwdPassword.setText("");
                txtUsername.requestFocus();
            }
        });

    }
    
    public static void main(String[] args) {
        // Create GUI on Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Gui();
            }
        });
    }
}
    
}