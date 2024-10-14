import javax.swing.*;
import java.awt.event.*;

public class AddMember extends JFrame {
    private JTextField memberIDField, memberNameField;

    public AddMember() {
        setTitle("Add Member");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        
        JLabel memberIDLabel = new JLabel("Member ID:");
        memberIDLabel.setBounds(50, 50, 100, 20);
        add(memberIDLabel);
        memberIDField = new JTextField();
        memberIDField.setBounds(150, 50, 200, 20);
        add(memberIDField);

        
        JLabel memberNameLabel = new JLabel("Member Name:");
        memberNameLabel.setBounds(50, 80, 100, 20);
        add(memberNameLabel);
        memberNameField = new JTextField();
        memberNameField.setBounds(150, 80, 200, 20);
        add(memberNameField);

        
        JButton addButton = new JButton("Add Member");
        addButton.setBounds(150, 150, 120, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String memberID = memberIDField.getText();
                String memberName = memberNameField.getText();

                if (memberID.isEmpty() || memberName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Logic to add the member to the system
                    JOptionPane.showMessageDialog(null, "Member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                }
            }
        });
        add(addButton);

        
        JButton backButton = new JButton("Back");
        backButton.setBounds(280, 150, 80, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MemberManagement();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }

    private void clearFields() {
        memberIDField.setText("");
        memberNameField.setText("");
    }
}
