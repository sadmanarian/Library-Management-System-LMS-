import javax.swing.*;
import java.awt.event.*;

public class RemoveMember extends JFrame {
    private JTextField memberIDField;

    public RemoveMember() {
        setTitle("Remove Member");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        
        JLabel memberIDLabel = new JLabel("Member ID:");
        memberIDLabel.setBounds(50, 50, 100, 20);
        add(memberIDLabel);
        memberIDField = new JTextField();
        memberIDField.setBounds(150, 50, 200, 20);
        add(memberIDField);

        
        JButton removeButton = new JButton("Remove Member");
        removeButton.setBounds(150, 100, 150, 30);
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String memberID = memberIDField.getText();

                if (memberID.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a Member ID.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Member removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    memberIDField.setText("");
                }
            }
        });
        add(removeButton);

        
        JButton backButton = new JButton("Back");
        backButton.setBounds(280, 100, 80, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MemberManagement();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }
}
