import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Library Management System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        
        JButton bookManagementButton = new JButton("Book Management");
        bookManagementButton.setBounds(100, 50, 200, 30);
        bookManagementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookManagement();
                dispose();
            }
        });
        add(bookManagementButton);

        
        JButton memberManagementButton = new JButton("Member Management");
        memberManagementButton.setBounds(100, 100, 200, 30);
        memberManagementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MemberManagement();
                dispose();
            }
        });
        add(memberManagementButton);

        
        JButton transactionManagementButton = new JButton("Transaction Management");
        transactionManagementButton.setBounds(100, 150, 200, 30);
        transactionManagementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TransactionManagement();
                dispose();
            }
        });
        add(transactionManagementButton);

        
        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(100, 200, 200, 30);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        setVisible(true);
    }
}

//     public static void main(String[] args) {
//         new MainMenu();
//     }
// }
