import javax.swing.*;
import java.awt.event.*;

public class BookManagement extends JFrame {
    public BookManagement() {
        setTitle("Book Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        
        JButton addBookButton = new JButton("Add Book");
        addBookButton.setBounds(100, 50, 200, 30);
        addBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddBook();
                dispose();
            }
        });
        add(addBookButton);

        
        JButton removeBookButton = new JButton("Remove Book");
        removeBookButton.setBounds(100, 100, 200, 30);
        removeBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RemoveBook();
                dispose();
            }
        });
        add(removeBookButton);

        
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
