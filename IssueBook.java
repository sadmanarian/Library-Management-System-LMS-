import javax.swing.*;
import java.awt.event.*;

public class IssueBook extends JFrame {
    public IssueBook() {
        setTitle("Issue Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Issue a Book");
        label.setBounds(150, 20, 100, 30);
        add(label);

        JButton issueButton = new JButton("Issue");
        issueButton.setBounds(150, 100, 100, 30);
        add(issueButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(150, 200, 100, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TransactionManagement();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }
}
