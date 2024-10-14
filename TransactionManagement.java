import javax.swing.*;
import java.awt.event.*;

public class TransactionManagement extends JFrame {
    public TransactionManagement() {
        setTitle("Transaction Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JButton issueBookButton = new JButton("Issue Book");
        issueBookButton.setBounds(100, 50, 200, 30);
        issueBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new IssueBook();
                dispose();
            }
        });
        add(issueBookButton);

        JButton returnBookButton = new JButton("Return Book");
        returnBookButton.setBounds(100, 100, 200, 30);
        returnBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReturnBook();
                dispose();
            }
        });
        add(returnBookButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(100, 150, 200, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }
}
