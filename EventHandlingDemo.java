import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class EventHandlingDemo extends JFrame {
    private JLabel statusLabel;
    private JTextField textField;
    private JCheckBox checkBox;
    
    public EventHandlingDemo() {
        setTitle("Event Handling Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Status bar
        statusLabel = new JLabel("Ready", SwingConstants.CENTER);
        statusLabel.setBorder(BorderFactory.createEtchedBorder());
        
        // Control panel
        JPanel controlPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // 1. Action event (button)
        JButton actionButton = new JButton("Click Me");
        actionButton.addActionListener(e -> 
            statusLabel.setText("Button clicked: " + new java.util.Date())
        );
        
        // 2. Focus event (text field)
        textField = new JTextField(20);
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                statusLabel.setText("Text field focused");
                textField.setBackground(Color.YELLOW);
            }
            @Override
            public void focusLost(FocusEvent e) {
                statusLabel.setText("Text field lost focus");
                textField.setBackground(Color.WHITE);
            }
        });
        
        // 3. Item event (checkbox)
        checkBox = new JCheckBox("Enable feature");
        checkBox.addItemListener(e -> 
            statusLabel.setText("Checkbox is " + (e.getStateChange() == ItemEvent.SELECTED ? "checked" : "unchecked"))
        );
        
        // 4. Key event (text field)
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                statusLabel.setText("Typed: " + e.getKeyChar());
            }
        });
        
        // 5. Mouse event on the whole window
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText(String.format("Mouse clicked at (%d, %d)", e.getX(), e.getY()));
            }
        });
        
        controlPanel.add(new JLabel("Action:"));
        controlPanel.add(actionButton);
        controlPanel.add(new JLabel("Focus & Key:"));
        controlPanel.add(textField);
        controlPanel.add(new JLabel("Item:"));
        controlPanel.add(checkBox);
        
        add(controlPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
        
        pack();
        setSize(400, 300);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EventHandlingDemo().setVisible(true));
    }
}
