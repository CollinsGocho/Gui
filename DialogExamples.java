import javax.swing.*;

public class DialogExamples {
    public static void main(String[] args) {
        // 1. Message dialog (information)
        JOptionPane.showMessageDialog(null, 
            "File saved successfully!", 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE);
        
        // 2. Warning dialog
        JOptionPane.showMessageDialog(null, 
            "Disk space is low", 
            "Warning", 
            JOptionPane.WARNING_MESSAGE);
        
        // 3. Error dialog
        JOptionPane.showMessageDialog(null, 
            "Connection failed", 
            "Error", 
            JOptionPane.ERROR_MESSAGE);
        
        // 4. Confirmation dialog (Yes/No/Cancel)
        int response = JOptionPane.showConfirmDialog(null, 
            "Do you want to save changes?", 
            "Save Changes", 
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.YES_OPTION) {
            System.out.println("User chose Yes");
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("User chose No");
        } else {
            System.out.println("User cancelled");
        }
        
        // 5. Input dialog (get text from user)
        String name = JOptionPane.showInputDialog(null, 
            "Enter your name:", 
            "Input", 
            JOptionPane.QUESTION_MESSAGE);
        
        if (name != null && !name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        }
        
        // 6. Custom option dialog (dropdown choices)
        String[] options = {"Red", "Green", "Blue"};
        int colorChoice = JOptionPane.showOptionDialog(null,
            "Choose your favorite color:",
            "Color Selection",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            options,
            options[0]);
        
        if (colorChoice >= 0) {
            System.out.println("Selected: " + options[colorChoice]);
        }
    }
}
