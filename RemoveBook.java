import javax.swing.*;
import java.awt.event.*;

public class RemoveBook extends JFrame {
    private JTextField bookIDField;

    public RemoveBook() {
        setTitle("Remove Book");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        
        JLabel bookIDLabel = new JLabel("Book ID:");
        bookIDLabel.setBounds(50, 50, 100, 20);
        add(bookIDLabel);
        bookIDField = new JTextField();
        bookIDField.setBounds(150, 50, 200, 20);
        add(bookIDField);

        
        JButton removeButton = new JButton("Remove Book");
        removeButton.setBounds(150, 100, 120, 30);
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookID = bookIDField.getText();

                if (bookID.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a Book ID.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Logic to remove the book from the system
                    JOptionPane.showMessageDialog(null, "Book removed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    bookIDField.setText("");
                }
            }
        });
        add(removeButton);

        
        JButton backButton = new JButton("Back");
        backButton.setBounds(280, 100, 80, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookManagement();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }
}
